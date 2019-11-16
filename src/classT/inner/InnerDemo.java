package classT.inner;

/**
 * @Author AceDJH
 * @Date 2019/11/16 14:53
 * 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
 * 那么可以省略该类的定义，而改为使用匿名内部类
 * 匿名内部类的定义格式：
 * 接口名称 对象名 =  new 接口名称(){
 *     //覆盖重写所有抽象方法
 * }
 * {...}这才是匿名内部类的内容
 */
public class InnerDemo {
    public static void main(String[] args) {
        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
        myInterfaceImpl.method();

        MyInterface myInterface = new MyInterfaceImpl();//左父右子
        myInterface.method();//使用多态

//        使用匿名内部类，但不是匿名对象，对象名称就叫obj
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();

//        使用匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法,无");
            }
        }.method();
    }
}
