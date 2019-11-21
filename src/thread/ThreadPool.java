package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author AceDJH
 * @Date 2019/11/21 14:29
 * 线程池
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(new RunnableImpl());
        service.submit(new RunnableImpl());
        service.submit(new RunnableImpl());
        service.submit(new RunnableImpl());

    }
}
