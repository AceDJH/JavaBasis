package methodcited;

/**
 * @Author AceDJH
 * @Date 2019/12/14 11:23
 * 引用类的实例方法
 */
public class MyStringDemo {
    public static void main(String[] args) {
        useMyString(new MyString() {
            @Override
            public String mySubString(String s, int begin, int end) {
                return s.substring(begin, end);
            }
        });

        useMyString(((s, begin, end) -> s.substring(begin, end)));

        // lambda表达式被类的实例方法替代的时候
        // 第一个参数作为调用者
        // 后面的参数全部传递给该方法作为参数
        // eg: s作为调用, begin和end被传递
        useMyString(String::substring);

    }

    private static void useMyString(MyString myString){
        String s = myString.mySubString("HelloWorld", 2, 5);
        System.out.println(s);
    }
}
