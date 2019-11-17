package collection;

/**
 * @Author AceDJH
 * @Date 2019/11/17 21:31
 * 可变参数，不需要传数组,也可以直接传数组
 * 可变参数底层是一个数组
 */
public class VarArgs {
    public static void main(String[] args) {
        int sum = 0;
        VarArgs args1 = new VarArgs();
        sum = args1.getSum(1,2,3,4,5);//15
        System.out.println(sum);
        int[] a = new int[]{1, 2, 3};
        System.out.println(args1.getSum(a));//6
        int[] b = {1,2,3,4,5,6,7};
        System.out.println(args1.getSum1(b));//28
    }

    public int getSum(int... nums){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
//    与getSum一个效果
    public int getSum1(int[] numsArray, int... nums){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (numsArray.length != 0){
            for (int i : numsArray) {
                sum += i;
            }
        }
        return sum;
    }
}
