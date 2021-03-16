package kmp;

/**
 * @Author coolDY
 * @Date 2021-03-16
 *
 * KMP算法
 */
public class KMPdemo {

    public static void main(String[] args) {
        String longStr = "abababcabcd";
        String shortStr = "abcd";

        System.out.println(getIndex(longStr,shortStr));

    }

    /**
     * 获取第一个匹配到的字符串首字母索引
     *  举例： 主串：aabaabaaf
     *       模式串：aabaaf
     *
     *  从前到后一次匹配，当匹配到主串的第二个b时，发现模式串为f不匹配
     *  所以会找模式串的前缀表[0 1 0 1 2]，找到f的前一位，为2，所以将模式串回溯到索引为2的位置，即模式串为b开始继续匹配
     *
     *
     * @param longStr
     * @param shortStr
     * @return
     */
    public static int getIndex(String longStr,String shortStr){
        char[] longChars = longStr.toCharArray();
        char[] shortChars = shortStr.toCharArray();

        int[] next = getNext(shortStr);

        int i = 0;//主串位置
        int j = 0;//模式串位置

        while (i < longChars.length && j < shortChars.length){
            if(longChars[i] == shortChars[j]){
                i++;
                j++;
            }else {
                /*//暴力破解法
                i = i - j + 1;//回溯到上一次匹配成功的下一个索引
                j = 0; //模式串从头开始*/

                //通过前缀数组表可以直接直到模式串需要回溯到哪个位置
                j = next[j-1];
            }
        }

        if(j == shortChars.length){
            return i - j;
        }else {
            return -1;
        }
    }

    /**
     * 求取next数组（前缀数组表）
     * @param str 模式字符串
     * @return
     *
     * 1.初始化next数组
     * 2.当next[i]和next[j]不相等情况
     * 3.当next[i]和next[j]相等情况
     * 4.赋值next数组
     *
     * 举例：aabaaf
     * 前缀：a  aa  aab  aaba  aabaa
     *      0   1   0     1     2
     * 前缀表为：0 1 0 1 2
     *
     */
    public static int[] getNext(String str){
        char[] chars = str.toCharArray();

        //前缀下标以及前缀表对应的值
        int j = 0;
        //定义前缀数组表
        int [] next = new int[str.length()];
        next[0] = 0;

        for (int i = 1; i < chars.length ; i++){
            //当前缀下标大于0且不相等时，则不断将前缀下标-1
            while (j > 0 && chars[j] != chars[i]){
                j--;
            }

            //相等时，将前缀下标+1并赋值给对应的前缀表值
            if(chars[j] == chars[i]){
                j++;
                next[i] = j;
            }
        }

        return next;
    }
}
