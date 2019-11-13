package classT;

import java.util.Scanner;

/**
 * @Author AceDJH
 * @Date 2019/11/13 9:25
 */
public class AnonymousTest {
    public static void main(String[] args) {
        //    普通方式调用
//    Scanner scanner = new Scanner(System.in);
//    int num = scanner.nextInt();


//    匿名对象的方式
        System.out.println("输入num:");
        int num = new Scanner(System.in).nextInt();
        System.out.println("num" + num);
    }


}
