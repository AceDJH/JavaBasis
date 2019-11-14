package classT.multi;

/**
 * @Author AceDJH
 * @Date 2019/11/14 15:01
 */
public class Zi extends Fu{
    int num = 20;
    @Override
    public void method() {
//        super.method();若是写上，则在调用时会出现"这是父类方法"
        System.out.println("这是子类方法");
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
}
