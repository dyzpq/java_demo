package jvm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author coolDY
 * @Date 2021-02-23
 * 字符串demo
 */
public class StringDemo {

    public static void main(String[] args) throws IOException {
       /* String s1 = new String("aa") + new String("bb");
        String s2 = "aabb";

        //当没有定义s2时，为true
        //当定义了s2时，为false
        System.out.println(s1.intern() == s1);*/

       /*String s = "a"+"b"+"c";
       String a = "a";
       String b = "b";
       String c = "c";
       String s1 = a + b + c;
       System.out.println(s == s1); //false*/

       /*//'计算机技术'这个字符串在字符串常量池中没有，所有调用str1.intern()方法获取时，直接指向堆中的'计算机技术'
       String str1 = new StringBuilder("计算机").append("技术").toString();
       System.out.println(str1.intern() == str1); //true*/

        /*//虽然和上面的例子一样，但是作为java关键字，字符串常量池中肯定早就有该字符串了，所有str2.intern()拿到的是字符串常量池中的值
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2); //false*/

        /*//new String("test")创建方式会在堆中创建一个'test'对象，也会在字符串常量池中创建一个'test'对象，str3.intern()是从字符串常量池中拿值，str3是从堆中拿值
        String str3 = new String("test");
        System.out.println(str3.intern() == str3);//false*/

       /* //toString()底层是调用new String()，和前一个例子一样
        String str4 = new StringBuilder("abc").toString();
        System.out.println(str4.intern() == str4);//false*/

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] s = str.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int i = s.length-1; i >= 0; i--) {
                sb.append(s[i]).append(" ");
            }
            System.out.println(sb);
        }*/

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int index = s.indexOf(".");
        int a =Integer.parseInt(s.substring(0,index));
        int b=Integer.parseInt(s.substring(index+1,index+2));
        if (b >=5) {
            System.out.println(a+1);
        }else {
            System.out.println(a);
        }

    }
}
