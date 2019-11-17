package genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author AceDJH
 * @Date 2019/11/17 17:04
 */
public class Poker {
    public static void main(String[] args) {
//        1：准备牌
        ArrayList<String> porkerBox = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

//        创建牌 拼接牌操作
        for (String color : colors) {
            for (String number : numbers) {
                String card = color + number;
                porkerBox.add(card);
            }
        }

//        大王，小王
        porkerBox.add("小王");
        porkerBox.add("大王");
//        2:洗牌
        Collections.shuffle(porkerBox);
//        3：发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < porkerBox.size(); i++) {
            String card = porkerBox.get(i);
            if (i >= 51){//存到底牌集合中
                dipai.add(card);
            }else {
                if (i % 3 == 0){
                    player1.add(card);
                } else if (i % 3 == 1) {
                    player2.add(card);
                }else {
                    player3.add(card);
                }
            }
        }

        System.out.println("段誉" + player1);
        System.out.println("乔峰" + player2);
        System.out.println("虚竹" + player3);
        System.out.println("底牌" + dipai);
    }
}
