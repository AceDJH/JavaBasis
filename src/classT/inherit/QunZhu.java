package classT.inherit;

import java.util.ArrayList;

/**
 * @Author AceDJH
 * @Date 2019/11/13 21:31
 */
public class QunZhu extends User {
    public QunZhu() {
    }

    public QunZhu(String username, double leftmoney) {
        super(username, leftmoney);
    }

    public ArrayList<Double> send(int money, int count){
        if (money > getLeftmoney()){
            System.out.println("余额不足");
            return null;
        }

        setLeftmoney(getLeftmoney() - money);

        ArrayList<Double> list = new ArrayList<>();
        int m = money / count;
        int l = money % count;

        for (int i = 0; i < count - 1; i++){
            list.add(i, (double) m);
        }

        if (l == 0){
            list.add((double) m);
        }else {
            list.add((double) (m + l));
        }

        return list;
    }
}
