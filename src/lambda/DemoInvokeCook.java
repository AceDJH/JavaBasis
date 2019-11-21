package lambda;

/**
 * @Author AceDJH
 * @Date 2019/11/21 14:51
 * 1. 使用Lambda必须具有接口，且要求接口中有且仅有一个抽象方法。
 * 无论是JDK内置的 Runnable 、 Comparator 接口还是自定义的接口，只有当接口中的抽象方法存在且唯一
 * 时，才可以使用Lambda。
 * 2. 使用Lambda必须具有上下文推断。
 * 也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例。
 * 备注：有且仅有一个抽象方法的接口，称为“函数式接口”。
 */
public class DemoInvokeCook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("做饭");
            }
        });

        invokeCook(() -> System.out.println("做饭"));
    }

    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
