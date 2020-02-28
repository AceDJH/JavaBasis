package interview;

/**
 * @Author AceDJH
 * @Date 2020/2/28 22:16
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        System.out.println(a.getA());
    }
}
