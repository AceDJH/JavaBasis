package interview;

/**
 * @Author AceDJH
 * @Date 2020/2/28 22:23
 * **静态内部类方式**
 *
 * 静态内部实现的单例是懒加载的且线程安全。
 *
 * 只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance（只有第一次使用这个单例的实例的时候才加载，同时不会有线程安全问题）。
 *
 * 推荐懒加载优雅写法 Initialization on Demand Holder（IODH）。
 */
public class Singleton1 {
    private static class SingletonHolder{
        private static Singleton1 instance  = new Singleton1();
    }

    public static Singleton1 getInstance(){
        return SingletonHolder.instance;
    }
}
