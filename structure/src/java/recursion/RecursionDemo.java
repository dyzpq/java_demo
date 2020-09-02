package recursion;

/**
 * @Author: dengyang
 * @Date: 2020/4/2 0002 17:51
 * 递归处理问题
 */
public class RecursionDemo {
    public static void main(String[] args) {
        print(6);
        int factorial = factorial(5);
        System.out.println(factorial);
    }


    /**
     * 递归实现打印
     * @param n
     */
    public static void print(int n){
        //需要一个判断退出递归的条件
        if(n == 1){
            return;
        }
        //调用递归需要让条件离退出递归的条件更近一步
        print(n-1);
        System.out.println("n="+n);
    }

    /**
     * 递归实现阶乘
     * @param n
     * @return
     */
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }else {
            return factorial(n-1) * n;
        }
    }
}

