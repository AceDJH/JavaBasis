package exception;

/**
 * @Author AceDJH
 * @Date 2019/11/18 23:11
 */
public class RegisterDemo {
    private static String[] names = {"jack", "tom", "jenny"};
    public static void main(String[] args) throws RegisterException {
        /*checkUsername("haha");
        System.out.println("注册成功");*/
        checkUsername("tom");
        System.out.println("注册成功");
    }

    public static void checkUsername(String uname) throws RegisterException {
        for (String name : names) {
            if (name.equals(uname)){
                throw new RegisterException("该名已经被注册过了");
            }
        }
    }
}
