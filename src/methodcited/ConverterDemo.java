package methodcited;

/**
 * @Author AceDJH
 * @Date 2019/12/3 18:35
 * lambda表达式被类方法替代时，它的形式参数全部传递给静态方法作参数
 */
public class ConverterDemo {
    public static void main(String[] args) {
        // lambda
        useConverter(s -> Integer.parseInt(s));
        //引用类方法
        // 类::静态方法
        useConverter(Integer::parseInt);

    }

    private static void useConverter(Converter converter){
        int number = converter.convert("666");
        System.out.println(number);
    }
}
