package classT.inherit;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author AceDJH
 * @Date 2019/11/13 21:40
 */
public class Member extends User {
    public Member() {
    }

    public Member(String username, double leftmoney) {
        super(username, leftmoney);
    }

    public void receive(ArrayList<Double> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
        Double money = list.remove(index);
        setLeftmoney(money);
    }
}
