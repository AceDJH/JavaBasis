package classT;

/**
 * @Author AceDJH
 * @Date 2019/11/12 23:18
 * 对象是引用类型，因此当把a的地址给b时，b改变值会影响到a
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone a = new Phone();
        System.out.println(a);
        System.out.println(a.brand);
        a.brand = "lala";
        System.out.println(a.brand);

        Phone b = a;
        System.out.println(b.brand);
        b.brand = "haha";
        System.out.println(a.brand);

        returnInt();//即使有返回值，不使用变量接收同样可以运行
    }

    public static int returnInt(){
        System.out.println("returnInt");
        return 2;
    }
}
