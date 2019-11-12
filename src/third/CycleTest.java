package third;

import java.util.Scanner;

/**
 * @Author AceDJH
 * @Date 2019/11/11 11:45
 */
public class CycleTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
//        System.out.println("name: " + name);
        do{
            System.out.println("lala");
            name = input.next();
        }while(name.equals("N"));
    }

}
