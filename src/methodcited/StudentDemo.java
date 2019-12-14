package methodcited;

/**
 * @Author AceDJH
 * @Date 2019/12/14 11:35
 * 引用构造器
 */
public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder((name, age) -> new Student(name, age));

        //lambda表达式被构造器替代时，它的形式参数全部传递给构造器作为参数
        useStudentBuilder(Student::new);
    }

    private static void useStudentBuilder(StudentBuilder studentBuilder){
        Student student = studentBuilder.build("乔峰", 32);
        //两者始终相同
        System.out.println(student);
        System.out.println(student.toString());
    }
}
