package reflect;

import java.lang.reflect.Constructor;

/**
 * @Author AceDJH
 * @Date 2020/1/18 20:28
 * 字节码文件中各成员对象的应用
 * 得到字节码文件对象中的构造器对象
 */
public class PeopleDemo {
    public static void main(String[] args) throws Exception {
        // 1.得到字节码文件对象
        Class class1 = Class.forName("reflect.People");
        // 2.得到字节码文件对象中的构造器对象
        /*批量得到构造器 s
        // getConstructors()只能得到public的构造器
        // Constructor[] constructors = class1.getConstructors();
        // getDeclaredConstructors()得到所有的构造器对象，无论其被什么修饰
        Constructor[] constructors = class1.getDeclaredConstructors();
        System.out.println(constructors.length);
        System.out.println(constructors[0]);
        */

        /*得到指定构造器*/
        // public
        Constructor constructor = class1.getConstructor(String.class, int.class);
        Object instance = constructor.newInstance("令狐冲", 27);//传实参
        System.out.println(instance);

        // default
        Constructor constructor1 = class1.getDeclaredConstructor(String.class);
        Object instance1 = constructor1.newInstance("李清扬");
        System.out.println(instance1);

        // private,私有构造器可以得到，但是不能用其创建对象
        Constructor constructor2 = class1.getDeclaredConstructor(int.class);
        // 暴力访问
        constructor2.setAccessible(true);
        Object instance2 = constructor2.newInstance(20);
        System.out.println(instance2);

    }
}
