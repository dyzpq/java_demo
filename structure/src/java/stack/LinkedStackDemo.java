package stack;

import java.util.Scanner;

/**
 * @Author: dengyang
 * @Date: 2020/4/1 0001 10:24
 * 链表模拟数组
 */
public class LinkedStackDemo {

    public static void main(String[] args) {

        LinkedStack linkedStack = new LinkedStack();

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
                    try {
                    linkedStack.show();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "push":
                    System.out.println("请输入要入栈的数字：");
                    int value = sc.nextInt();
                    linkedStack.push(value);
                    break;
                case "pop":
                    try {
                        System.out.println(linkedStack.pop());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "peek":
                    try {
                        System.out.println(linkedStack.peek());
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

/**
 * 链表栈
 */
class LinkedStack{

    private Node headNode = new Node(0);

    /**
     * 入栈(使用链表的头插法)
     * @param value
     */
    public void push(int value){

        Node node  = new Node(value);

        //辅助指针
        Node temp = headNode.next;

        //插入到头节点的后面
        headNode.next = node;
        node.next = temp;

    }

    /**
     * 出栈（那有效的第一个元素）
     * @return
     */
    public int pop(){
        if(headNode.next == null){
           throw new RuntimeException("栈空");
        }
        //辅助指针
        Node temp = headNode.next;

        headNode.next = temp.next;

        return temp.data;
    }

    /**
     * 查看栈顶元素
     * @return
     */
    public int peek(){
        if(headNode.next == null){
            throw new RuntimeException("栈空");
        }

        return headNode.next.data;
    }

    /**
     * 查看栈
     */
    public void show(){
        if(headNode.next == null){
            throw new RuntimeException("栈空");
        }

        //辅助指针
        Node temp = headNode.next;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

/**
 * 节点类
 */
class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }
}
