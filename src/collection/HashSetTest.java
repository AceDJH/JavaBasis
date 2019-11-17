package collection;

import java.util.HashSet;

/**
 * @Author AceDJH
 * @Date 2019/11/17 20:57
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        String a = "种地";
        String b = "耕田";
        String c = "lala";
        String d = "lala";//与c的hash值相同
        hashSet.add(a);
        hashSet.add(b);
        hashSet.add(c);
        hashSet.add(d);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
//        输出无序
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

}
