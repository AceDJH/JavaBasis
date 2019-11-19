package thread;

/**
 * @Author AceDJH
 * @Date 2019/11/19 19:19
 */
public class MyThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        // 也可写成链式调用
        System.out.println(Thread.currentThread().getName());
        MyThread1 myThread1 = new MyThread().new MyThread1("新的线程！");
        myThread1.start();
        // 多线程执行时，在栈内存中，其实每一个执行线程都有一片自己所属的栈内存空间。进行方法的压栈和弹栈。
        // 若使用run方法调用线程，则没有开启新栈空间，依旧是单线程
        // myThread1.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("main线程" + i);
        }
    }

    public class MyThread1 extends Thread{
        public MyThread1() {
        }

        public MyThread1(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(getName() + ": 正在执行！" + i);
            }
        }

        // Thread t = new Thread("测试在非main线程中创建线程");
        // 不会出现start方法，即不能开启新线程
    }
}
