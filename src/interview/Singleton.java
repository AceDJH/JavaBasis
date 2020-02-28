package interview;

/**
 * @Author AceDJH
 * @Date 2020/2/28 22:07
 * **简单来说使用单例模式可以带来下面几个好处:**
 *
 * - 对于频繁使用的对象，可以省略创建对象所花费的时间，这对于那些重量级对象而言，是非常可观的一笔系统开销；
 * - 由于 new 操作的次数减少，因而对系统内存的使用频率也会降低，这将减轻 GC 压力，缩短 GC 停顿时间。
 * **懒汉式(双重检查加锁版本)**
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;
    private int a = 1;
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            synchronized(Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
