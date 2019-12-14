package methodcited;

/**
 * @Author AceDJH
 * @Date 2019/12/14 10:35
 */
public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable(new Printable() {
            @Override
            public void printString(String s) {
                System.out.println(s);
            }
        });

        usePrintable((s -> {
            System.out.println(s);
        }));

        usePrintable(s -> System.out.println(s));

        // 方法引用符: ::
        // 可推导的就是可省略的
        usePrintable(System.out::println);


    }

    private static void usePrintable(Printable printable){
        printable.printString("你好哇");
    }
}
