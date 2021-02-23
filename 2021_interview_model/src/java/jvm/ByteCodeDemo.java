package jvm;

/**
 * @Author coolDY
 * @Date 2021-02-23
 */
public class ByteCodeDemo {

    public static void main(String[] args) {
        System.out.println("main开始");
        calculate();
        System.out.println("main结束");
    }

    public static void calculate(){
        int a = 10;
        int b = 20;
        int c = (a+b) * 2;
        System.out.println(c);
    }
}
