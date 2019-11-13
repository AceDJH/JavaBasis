package classT.staticT;

/**
 * @Author AceDJH
 * @Date 2019/11/13 10:46
 */
public class Student {
//    特点：当第一次用到本类时，静态代码块执行唯一的一次
//    静态内容总是优先于非静态，所以静态代码块比构造方法先执行
    static {
        System.out.println("静态代码块执行");
    }
    private int id;
    private String name;
    private int age;//成员变量
    private static String room;//静态变量
    private static int idCounter = 0;

    public static void methodStatic(){
        System.out.println("这是一个静态方法");
//        静态方法可以访问静态变量
        System.out.println(room);
//        静态方法不能访问非静态,以下写法报错
//        System.out.println(name);
    }

    public Student(){
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    //成员方法属于对象，不属于类
    public void setAge(int age) {
        this.age = age;
    }

    //静态方法属于类，不属于对象
    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
