package jvm;

/**
 * @Author coolDY
 * @Date 2021-02-23
 */
public class StringDemo {

    public static void main(String[] args) {
       /* String s1 = new String("aa") + new String("bb");
        String s2 = "aabb";

        //当没有定义s2时，为true
        //当定义了s2时，为false
        System.out.println(s1.intern() == s1);*/

       String s = "a"+"b"+"c";
       String a = "a";
       String b = "b";
       String c = "c";
       String s1 = a + b + c;
       System.out.println(s == s1); //false
    }
}
