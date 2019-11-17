package classT.inherit;

import java.util.ArrayList;

/**
 * @Author AceDJH
 * @Date 2019/11/13 21:43
 * 发红包
 */
public class MainRedPacket {
    public static void main(String[] args) {
        QunZhu qunZhu = new QunZhu("群主", 100);

        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        qunZhu.toString();
        one.toString();
        two.toString();
        three.toString();
        System.out.println("==========================");

        ArrayList<Double> redList = qunZhu.send(20, 3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        qunZhu.toString();
        one.toString();
        two.toString();
        three.toString();
    }
}
