package classT.multi;

/**
 * @Author AceDJH
 * @Date 2019/11/14 15:01
 */
public class Fu {
    int num = 10;
    boolean bool = true;
    public void method(){
        System.out.println("这是父类方法");
    }

    public void methodFu(){
        System.out.println("这是父类特有方法");
    }

    public void showNum(){
        System.out.println(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }
}
