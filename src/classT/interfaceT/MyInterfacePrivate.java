package classT.interfaceT;

/**
 * @Author AceDJH
 * @Date 2019/11/13 22:56
 * 从JAVA9开始，接口当中允许定义私有方法
 * 由于我的jdk是8，因此不体验了
 */
public interface MyInterfacePrivate {
    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommon();
    }

    public default void methodCommon(){//正确的应该是private void methodCommon()
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
