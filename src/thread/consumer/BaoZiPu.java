package thread.consumer;

/**
 * @Author AceDJH
 * @Date 2019/11/21 12:26
 * 包子铺线程和包子线程关系-->通信（互斥）
 */
public class BaoZiPu extends Thread{
    // 需要在成员位置创建一个包子变量
    private BaoZi baoZi;

    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    // 设置线程：生产包子，生产一个就让吃货吃一个
    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (baoZi){
                if (baoZi.flag == true){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 被唤醒之后进行，包子铺生产包子
                // 交替生产两种包子
                if (count % 2 == 0){
                    baoZi.pi = "薄皮";
                    baoZi.xian = "西红柿鸡蛋";
                }else {
                    baoZi.pi = "冰皮";
                    baoZi.xian = "韭黄鸡蛋";
                }

                count++;
                System.out.println("包子铺正在生产" + baoZi.toString());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 包子生产好了
                baoZi.flag = true;
                baoZi.notify();
                System.out.println("包子铺已经生产好了" + baoZi.toString() + "吃货可以吃了");
            }
        }
    }
}
