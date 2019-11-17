package genericity;

/**
 * @Author AceDJH
 * @Date 2019/11/17 15:35
 * 泛型没有继承概念
 */
public class GenericMethod {
    public <E> void show(E e){
        System.out.println(e.getClass());
    }

    public static <E> void show1(E e){
        System.out.println(e.getClass());
    }


}
