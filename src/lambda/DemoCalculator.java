package lambda;

/**
 * @Author AceDJH
 * @Date 2019/11/21 15:17
 */
public class DemoCalculator {
    public static void main(String[] args) {
        // 匿名内部类
        invokeCalc(2, 3, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // lambda
        invokeCalc(20, 30, (a, b) -> a + b);
    }

    public static void invokeCalc(int a, int b, Calculator calculator){
        int sum = calculator.calc(a, b);
        System.out.println(sum);
    }
}
