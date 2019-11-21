package thread.consumer;

/**
 * @Author AceDJH
 * @Date 2019/11/21 12:24
 */
public class BaoZi {
    String pi;
    String xian;
    // 包子的状态：有true， 没有false
    boolean flag = false;

    @Override
    public String toString() {
        return "pi='" + pi + '\'' +
                ", xian='" + xian + '\'' +
                "包子";
    }
}
