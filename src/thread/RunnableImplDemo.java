package thread;

/**
 * @Author AceDJH
 * @Date 2019/11/19 19:48
 */
public class RunnableImplDemo {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread t = new Thread(runnable);
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "=>" + i);
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("la");
            }
        }).start();

    }
}
