package reflect;

/**
 * @Author AceDJH
 * @Date 2020/1/18 20:28
 */
public class People {
    private String name;
    private int age;

    protected People(){}
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // default
    People(String name) {
        this.name = name;
    }
    private People(int age) {
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
        System.out.println("吃饭...");
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
