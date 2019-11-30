package exception;

/**
 * @Author AceDJH
 * @Date 2019/11/30 17:48
 * 将1/0包进try catch后，编译器不会报错（没有红色警告）
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
            System.out.println("lala");//不执行
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
