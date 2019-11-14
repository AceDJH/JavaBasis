package classT.inner;

/**
 * @Author AceDJH
 * @Date 2019/11/14 21:22
 * 内部类
 */
public class Body {//外部类
    private String name;
    int num = 10;
    public class Heart{//成员内部类
        int num = 20;
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫" + name);
        }

        public void methodInner(){
            int num = 30;
            System.out.println(num);//30
            System.out.println(this.num);//20,相当于是Heart.this
            System.out.println(Body.this.num);//10
        }
    }

    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
