package basic;

/**
 * @Author AceDJH
 * @Date 2019/11/11 11:45
 */
public class StringTest {
    public static void main(String[] args){
        System.out.println("hello world");
        double a = 2.0 - 1.1;
        System.out.println(a);
        String b = "";
        System.out.println(b);
        System.out.println(3.0 / 0);
        String c = "asdasd";
        System.out.println(c.codePointAt(1));
        String dir = System.getProperty("user.dir");
        System.out.println("dir : "+ dir);
    }
}
