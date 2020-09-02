package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: dengyang
 * @Date: 2020/4/1 0001 11:22
 * 逆波兰表达式（后缀表达式）--->实现计算器
 */
public class ReversePolishNotationDemo {
    public static void main(String[] args) {
        String str = "6+5*3+(5-2)*8";

        //[6, +, 5, *, 3, +, (, 5, -, 2, ), *, 8]
        List<String> infixExpressionList = toInfixExpressionList(str);
        System.out.println("infixExpressionList="+infixExpressionList);

        //[6, 5, 3, *, +, 5, 2, -, 8, *, +]
        List<String> suffixExpressionList = toSuffixExpressionList(infixExpressionList);
        System.out.println("suffixExpressionList="+suffixExpressionList);

        //45
        int result = calculate(suffixExpressionList);
        System.out.println(result);
    }


    /**
     * 将字符串转换为中缀表达式的集合
     *
     * 举例：
     *      "6+5*3+(5-2)*8" --->list(6,+,5,*,3,+,(,5,-,2,),*,8)
     * 思路分析：
     *      1.创建一个指针index，对字符串进行遍历
     *      2.如果是数字，则进行进行扫描，判断下一个是否也是数字，这样可以保证多位数
     *      3.如果不是，则直接放入list中
     *      4.知道index扫描到最后
     * @param s
     * @return
     */
    public static List<String> toInfixExpressionList(String s){

        List<String> infixExpressionList = new ArrayList<>();
        //扫描字符串所用指针
        int index = 0;
        //拼接数字的字符串变量
        String str = "";
        //判断是否为数字的字符
        char c;
        do{
            //如果为符号，直接压入
            if((c=s.charAt(index)) < 48 || (c=s.charAt(index))>57){
                infixExpressionList.add(""+c);
                index++;
            }else {
                //如果是数字，则判断下一个是否为数字
                str = "";
                while (index<s.length() && (c=s.charAt(index))>=48 && (c=s.charAt(index))<=57){
                    str += c;
                    index++;
                }
                infixExpressionList.add(str);
            }
        }while (index<s.length());
        return infixExpressionList;

        /*while (true){
            if(index == str.length()){
                break;
            }
            //截取一个字符
            c = str.substring(index, index + 1).charAt(0);
            //如果是数字，继续扫描
            if(c >=48 && c<=57){
                nums = ""+c;
                index++;
                //判断下一个是否继续为数字
                while (true){
                    if(index == str.length()){
                        break;
                    }
                    c = str.substring(index,index+1).charAt(0);
                    if(c<48 || c>57){
                        break;
                    }else {
                        //如果是数字，则继续拼接
                        nums = nums+c;
                        index++;
                    }
                }
                infixExpressionList.add(nums);

            }else {
                //如果不是数字，那么就是符号，直接加入到list中
                infixExpressionList.add(""+c);
                index++;
            }
        }
        return infixExpressionList;*/
    }


    /**
     * 中缀表达式转后缀表达式
     *
     * 例如：
     *      list(6,+,5,*,3,+,(,5,-,2,),*,8) ---> list(6,5,3,*,+,5,2,-,8,*,+)
     *
     * 思路分析：
     *      1.创建一个栈--->存放符号, 创建一个集合--->存放最后的结果
     *      2.如果是数字，直接放入集合中
     *      3.如果当前的是符号
     *          3.1 如果是"("符号，压入栈中
     *          3.2 如果是")"符号，则将之前压入的符号弹栈到集合中，直到遇到"("
     *          3.3 如果栈中没有符号，则将当前符号压入栈中
     *          3.4 如果栈中有符号，判断当前符号与栈顶符号的优先级
     *              3.4.1 若当前符号优先级大于栈顶符号，则将当前符号压入到栈中
     *              3.4.2 若当前符号优先级小于等于栈顶符号，则依次出栈存入到集合中，直到遇到当前符号优先级大于栈顶的符号，然后将当前符号压入到栈中
     *      4.当数据扫描完毕之后，依次将剩下的栈中的符号弹出到集合中
     *
     * @param list
     * @return
     */
    public static List<String> toSuffixExpressionList(List<String> list){

        if(list.size()==0){
            return new ArrayList<>();
        }
        //创建一个存符号的栈
        Stack<String> operStack = new Stack<>();
        //创建一个集合存结果
        List<String> suffixExpressionList = new ArrayList<>();

        for (String item : list) {
            //如果是数字，直接放入集合中
            if(item.matches("\\d+")){
                suffixExpressionList.add(item);
            //如果不是数字，则为字符
                //如果是"("符号，压入栈中
            }else if(item.equals("(")){
                    operStack.push(item);
                //如果是")"符号，则将之前压入的符号弹栈到集合中，直到遇到"("
            }else if(item.equals(")")){
                while (!operStack.peek().equals("(")){
                    suffixExpressionList.add(operStack.pop());
                }
                operStack.pop();
                //如果不是"("或者")"则：判断优先级
            }else{
                while (!operStack.empty() && Operation.getLevel(item)<=Operation.getLevel(operStack.peek())){
                    suffixExpressionList.add(operStack.pop());
                }
                operStack.push(item);
                /*//如果栈中没有符号，则将当前符号压入栈中
                if(operStack.empty()){
                    operStack.push(item);
                }else {
                    //若当前符号优先级大于栈顶符号，则将当前符号压入到栈中
                    if(Operation.getLevel(item)>Operation.getLevel(operStack.peek())){
                        operStack.push(item);
                    }else {
                        //若当前符号优先级小于等于栈顶符号，则依次出栈存入到集合中，直到遇到当前符号优先级大于栈顶的符号，然后将当前符号压入到栈中
                        while (true){
                            if(operStack.empty() || Operation.getLevel(item) > Operation.getLevel(operStack.peek())){
                               break;
                            }
                            suffixExpressionList.add(operStack.pop());
                        }
                        operStack.push(item);
                    }
                }*/
            }
        }
        while (!operStack.empty()){
            suffixExpressionList.add(operStack.pop());
        }
        //当数据扫描完毕之后，依次将剩下的栈中的符号弹出到集合中
        return suffixExpressionList;
    }


    /**
     * 计算结果
     * 如果是数字，则压入栈，如果是符号，则出栈两个数字进行计算，再将结果压入栈
     * @param list
     * @return
     */
    public static int calculate(List<String> list){
        //创建一个栈
        Stack<String> numStack = new Stack<>();

        for (String item : list) {

            //数字则入栈
            if(item.matches("\\d+")){
               numStack.push(item);
            }else {
                int num1 = Integer.parseInt(numStack.pop());
                int num2 = Integer.parseInt(numStack.pop());
                int res = 0;
                switch (item){
                    case "+":
                        res = num2+num1;
                        break;
                    case "-":
                        res = num2-num1;
                        break;
                    case "*":
                        res = num2*num1;
                        break;
                    case "/":
                        res = num2/num1;
                        break;
                }
                numStack.push(""+res);
            }
        }
        return Integer.parseInt(numStack.pop());
    }
}


/**
 * 符号工具类
 */
class Operation{
    private static final int ADD = 1;
    private static final int SUB = 1;
    private static final int MUL = 2;
    private static final int DIV = 2;

    public static int getLevel(String oper){
        int res = 0;
        switch (oper){
            case "+":
                res = ADD;
                break;
            case "-":
                res = SUB;
                break;
            case "*":
                res = MUL;
                break;
            case "/":
                res = DIV;
                break;
        }
        return res;
    }
}

