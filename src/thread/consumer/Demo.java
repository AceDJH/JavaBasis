package thread.consumer;

/**
 * @Author AceDJH
 * @Date 2019/11/21 12:47
 */
public class Demo {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new BaoZiPu(baoZi).start();
        new ChiHuo(baoZi).start();
    }
}
