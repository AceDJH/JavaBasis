package reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author AceDJH
 * @Date 2020/1/18 13:29
 * 使用反射得到对象
 * 使用反射得到对象就不需要new了
 */
public class PersonDemo {
    public static void main(String[] args) throws Exception {
        // 读取配置文件中类的信息
        FileReader fileReader = new FileReader("src/reflect/person.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string = bufferedReader.readLine();
        System.out.println(string);
        // 用字节码文件对象创建一个类的对象
        // Class class1 = Class.forName("reflect.Person");
        Class class1 = Class.forName(string);
        // 得到字节码文件对象中的构造器对象
        Constructor[] constructors = class1.getConstructors();
        // 两个构造方法：默认构造，带参数的构造，因此长度为2
        System.out.println(constructors.length);
        System.out.println(constructors[0]);
        System.out.println(constructors[1]);

        Constructor constructor = constructors[0];
        Object object = constructor.newInstance();
        Person person1 = (Person) object;
        person1.eat();

        // 体验多态
        System.out.println(object.toString());
    }
}
