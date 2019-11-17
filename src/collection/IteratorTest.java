package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author AceDJH
 * @Date 2019/11/16 17:19
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");

        Iterator<String> iterator = coll.iterator();
        for (int i = 0; i < 3; i++){
            boolean b = iterator.hasNext();
            System.out.println(b);
            String s = iterator.next();
            System.out.println(s);
        }

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        ArrayList<String> a = new ArrayList<>();

    }
}
