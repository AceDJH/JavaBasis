package genericity;

/**
 * @Author AceDJH
 * @Date 2019/11/17 15:36
 */
public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethod a = new GenericMethod();
        a.show("a");
        GenericMethod.show1(2);
    }
}
