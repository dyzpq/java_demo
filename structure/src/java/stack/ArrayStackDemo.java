package stack;

import java.util.Scanner;

/**
 * @Author: dengyang
 * @Date: 2020/4/1 0001 9:52
 * 数组模拟栈
 */
public class ArrayStackDemo {
    public static void main(String[] args) {

        int size = 5;
        ArrayStack arrayStack = new ArrayStack(size);

        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop){
            System.out.println("show--->查看栈");
            System.out.println("push--->入栈");
            System.out.println("pop--->出栈");
            System.out.println("peek--->查看栈顶元素");
            System.out.println("exit--->退出程序");
            System.out.println("请输入您的选择：");

            String next = sc.next();
            switch (next){
                case "show":
                    arrayStack.show();
                    break;
                case "push":
                    System.out.println("请输入要入栈的数字：");
                    int value = sc.nextInt();
                    arrayStack.push(value);
                    break;
                case "pop":
                    try {
                        System.out.println(arrayStack.pop());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "peek":
                    try {
                        System.out.println(arrayStack.peek());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit":
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
        System.out.println("退出程序");
    }
}

class ArrayStack{

    private int maxSize;
    private int top;
    private int arr[];

    public ArrayStack(int size){
        this.maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    /**
     * 判空
     */
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    /**
     * 判满
     */
    public boolean isFull(){
        if(top == maxSize-1){
            return true;
        }
        return false;
    }

    /**
     * 入栈
     * @param num
     */
    public void push(int num){
        if(this.isFull()){
            System.out.println("栈满，无法添加");
            return;
        }
        top++;
        arr[top] = num;
    }

    /**
     * 出栈
     * @return
     */
    public int pop(){
        if (this.isEmpty()){
            throw new RuntimeException("栈空~~~");
        }
        int value = arr[top];
        top--;
        return value;
    }

    /**
     * 查看栈
     */
    public void show(){
        if(this.isEmpty()){
            System.out.println("栈为空");
        }
        //需要逆序打印，后进先出
        for (int i = top; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 查看栈顶元素
     * @return
     */
    public int peek(){
        if(this.isEmpty()){
            throw new RuntimeException("栈空~~~");
        }
        return arr[top];
    }

}


