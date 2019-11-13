package classT.staticT;

/**
 * @Author AceDJH
 * @Date 2019/11/13 10:46
 * 静态只能直接访问静态，不能直接访问非静态
 * 静态方法不能使用this
 * this代表当前对象
 */
public class StaticTest {
    public static void main(String[] args) {
        Student one = new Student("郭靖", 19);
//        加上Static后就变成了静态方法，对象可以调用， 但是不推荐，应用类去调用
//        正确，推荐
        Student.setRoom("101教师");
        System.out.println(one.toString() + "教室: " + Student.getRoom());
        //正确，不推荐,这种写法在编译之后也会被javac翻译成"类名称.静态方法名"
        System.out.println(one.getRoom());

//        对于本类当中的静态方法，可以省略类名称
        myMethod();
//        完全等效
        StaticTest.myMethod();
    }

    public static void myMethod(){
        System.out.println("自己的方法");
    }
}
