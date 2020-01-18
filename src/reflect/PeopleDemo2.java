package reflect;

import java.lang.reflect.Method;

/**
 * @Author AceDJH
 * @Date 2020/1/18 21:37
 * 得到字节码文件对象中的方法对象
 */
public class PeopleDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class class1 = Class.forName("reflect.People");
        Method[] methods = class1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
