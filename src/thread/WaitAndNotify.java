package thread;

/**
 * @Author AceDJH
 * @Date 2019/11/19 20:57
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        // 创建锁对象，保证唯一
        Object object = new Object();
        // 创建一个顾客线程（消费者）
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 一直买包子
                while (true){
                    // 保证等待和唤醒的线程只有一个执行，需要使用同步技术。
                    // 这种方法是同步代码块,此外还有同步方法，lock锁
                    synchronized (object){
                        System.out.println("告知老板要的包子的种类和数量");
                        // 调用wait方法，放弃cpu的执行，进入到waitting状态（无限等待）
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了,开吃");
                        System.out.println("-----------------------------");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                // 一直卖包子
                while (true){
                    // 花3秒做包子
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // 保证等待和唤醒的线程只有一个执行，需要使用同步技术。
                    synchronized (object){
                        System.out.println("老板3秒之后做好包子，可以吃包子了");
                        // 做好包子之后，调用notify方法，唤醒顾客吃包子
                        object.notify();
                    }
                }
            }
        }).start();
    }
}
