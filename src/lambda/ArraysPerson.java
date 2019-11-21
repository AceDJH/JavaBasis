package lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author AceDJH
 * @Date 2019/11/21 14:59
 * 在Lambda标准格式的基础上，使用省略写法的规则为：
 * 1. 小括号内参数的类型可以省略；
 * 2. 如果小括号内有且仅有一个参，则小括号可以省略；
 * 3. 如果大括号内有且仅有一个语句，则无论是否有返回值，都可以省略大括号、return关键字及语句分号。
 */
public class ArraysPerson {
    public static void main(String[] args) {
        Person[] people = {
                new Person("令狐冲", 28),
                new Person("令狐冲1", 35),
                new Person("令狐冲2", 20),
        };

        /*
        // 进行升序排序（前边-后边）
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // lambda
        Arrays.sort(people, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        */

        // lambda
        Arrays.sort(people, (o1, o2) -> o1.getAge() - o2.getAge());

        // 加上toString方法后可以直接这样输出，与下面的等价
        for (Person person : people) {
            System.out.println(person);
        }
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
