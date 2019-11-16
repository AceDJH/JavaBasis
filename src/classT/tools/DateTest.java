package classT.tools;

import java.text.*;
import java.util.Date;

/**
 * @Author AceDJH
 * @Date 2019/11/16 15:52
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        String str = format.format(date);// 把Date对象转换成String
        System.out.println(str);

        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str1 = "2019年11月16日";
        Date date1 = df.parse(str1);//把String转换成Date对象
        System.out.println(date);
    }
}
