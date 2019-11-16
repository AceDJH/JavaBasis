package classT.tools;

import java.util.ArrayList;

/**
 * @Author AceDJH
 * @Date 2019/11/16 16:44
 */
public class Wrapper {
    public static void main(String[] args) {
        Integer a = 1;//自动装箱
        int b = a + 2;//自动拆箱
        System.out.println(b);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);//自动装箱
        System.out.println(arrayList.toString());
        System.out.println(arrayList);

    }
}
