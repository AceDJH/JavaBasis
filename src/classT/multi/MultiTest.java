package classT.multi;

/**
 * @Author AceDJH
 * @Date 2019/11/14 15:02
 * 访问成员变量的两种方式：
 * 1.直接通过成员对象名称访问，等号左边是谁，优先用谁，没有则想上找
 * 2.间接通过成员方法访问，看该方法属于谁，优先用谁，没有则想上找
 */
public class MultiTest {
    public static void main(String[] args) {
//        使用多态的写法
//        左侧父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();
        obj.method();//使是子类方法
        obj.methodFu();//这是父类特有方法

        System.out.println(obj.num);//父中的成员变量10
        System.out.println(obj.getNum());//调用成员方法，因此结果为子的20
        obj.showNum();//子类没有覆盖重写，就是父：10；子类覆盖重写，就是子：20
    }
}
