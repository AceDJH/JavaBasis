package thread.consumer;

/**
 * @Author AceDJH
 * @Date 2019/11/21 12:34
 */
public class ChiHuo extends Thread{
    // 需要在成员位置创建一个包子变量
    private BaoZi baoZi;

    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    // 设置线程：吃包子
    @Override
    public void run() {
        while (true){
            synchronized (baoZi){
                if (baoZi.flag == false){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 被唤醒之后执行，吃包子
                System.out.println("吃货正在吃" + baoZi.toString());
                // 吃完包子
                baoZi.flag = false;
                baoZi.notify();
                System.out.println("吃货已经把" + baoZi.toString() + "吃完了，包子铺开始生产包子");
                System.out.println("--------------------------------------");
            }
        }
    }
}
