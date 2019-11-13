package classT.interfaceT;

/**
 * @Author AceDJH
 * @Date 2019/11/13 22:27
 * java8出现的新特性，接口里允许定义默认方法
 * 备注：接口当中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {
//    抽象方法
    public abstract void methodAbs();

//    新添加了一个抽象方法
//    public abstract void methodAbs2();

//    新添加默认方法，原来实现了接口的类，不需要更改也能继续使用
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
