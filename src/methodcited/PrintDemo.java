package methodcited;

/**
 * @Author AceDJH
 * @Date 2019/12/3 18:50
 */
public class PrintDemo {
    public static void main(String[] args) {
        // lambda
        usePrinter(s -> System.out.println(s.toUpperCase()));

        usePrinter((String s) -> {
            String result = s.toUpperCase();
            System.out.println(result);
        });

        /*复制过来方便理解引用时做了什么，不使用
        public class PrintString {
            public void printUpper(String s){
                String result = s.toUpperCase();
                System.out.println(result);
            }
        }*/

        // 引用对象的实例方法
        // 对象::对象方法
        // lambda表达式被对象的实例方法替代的时候，它的形式参数全部传递给该方法作为参数
        PrintString printString = new PrintString();
        usePrinter(printString::printUpper);
    }



    private static void usePrinter(Printer printer){
        printer.printUpperCase("HelloWorld");
    }
}
