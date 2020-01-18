package reflect;

/**
 * @Author AceDJH
 * @Date 2020/1/18 13:28
 */
public class Person2 {
    private String name;
    private int age;
    public Person2() {
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭222...");
    }

    @Override
    public String toString() {
        return "Person2{}";
    }
}
