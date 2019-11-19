package thread;

/**
 * @Author AceDJH
 * @Date 2019/11/19 19:46
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
