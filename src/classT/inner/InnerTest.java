package classT.inner;

/**
 * @Author AceDJH
 * @Date 2019/11/14 21:25
 */
public class InnerTest {
    public static void main(String[] args) {
        Body body = new Body();//外部类的对象
        body.methodBody();
        Body.Heart heart = body.new Heart();
        heart.beat();
        Body.Heart heart1 = new Body().new Heart();
        heart1.beat();
        heart1.methodInner();
    }
}
