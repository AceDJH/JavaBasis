package exception;

/**
 * @Author AceDJH
 * @Date 2019/11/18 23:11
 */
public class RegisterRuntimeDemo {
    private static String[] names = {"jack", "tom", "jenny"};
    public static void main(String[] args){
        /*checkUsername("haha");
        System.out.println("注册成功");*/
        checkUsername("tom");
        System.out.println("注册成功");
    }

    public static void checkUsername(String uname)/*由于是运行期异常,此处不需要throws*/ {
        for (String name : names) {
            if (name.equals(uname)){
                //抛出运行期异常，无需处理，交给JVM处理，中断处理
                throw new RegisterRuntimeException("该名已经被注册过了");
            }
        }
    }
}
