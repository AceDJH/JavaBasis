package lambda;

/**
 * @Author AceDJH
 * @Date 2019/11/21 14:44
 */
public class DemoLambda {
    public static void main(String[] args) {
        // 使用匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();

        // 使用Lambda实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "新线程创建了");
        }).start();
    }
}
