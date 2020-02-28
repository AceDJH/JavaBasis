package interview;

/**
 * @Author AceDJH
 * @Date 2020/2/28 22:16
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        a.setA(5);
        System.out.println(a.getA());// 5
        Singleton b = new Singleton();
        System.out.println(b.getA());// 1
        Singleton c = Singleton.getInstance();
        System.out.println(c.getA());// 5 取得的是同一个实例（跨越到另一个类eg:SingletonTest就不是同一实例了）

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = new Singleton1();
    }
}
