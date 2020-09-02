package queue;

import java.util.Scanner;

/**
 * @Author: dengyang
 * @Date: 2020/3/28 0028 14:41
 * 数组模拟环形队列
 */
public class ArrayCircularQueueDemo {

    public static void main(String[] args) {

        ArrayCircularQueue queue = new ArrayCircularQueue(4);

        Scanner sc = new Scanner(System.in);

        boolean loop = true;
        while (loop){

            System.out.println("a--->添加");
            System.out.println("g--->获取");
            System.out.println("h--->查看头");
            System.out.println("s--->查看队列");
            System.out.println("e--->退出");

            switch (sc.next()){
                case "a":
                    System.out.println("请输入需要添加的值：");
                    int value = sc.nextInt();
                    queue.add(value);
                    break;
                case "g":
                    try {
                        System.out.println(queue.get());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "h":
                    try {
                        System.out.println(queue.head());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "s":
                    queue.show();
                    System.out.println();
                    break;
                case "e":
                    System.out.println("系统已退出");
                    loop = false;
                    break;
                default:
                    System.out.println("输入无效请重新输入");
                    continue;
            }
        }
    }

}

/**
 * 环形队列类
 *
 * 最多存储数据为数组的大小-1
 *
 *四个变量：
 *      maxSize--->队列大小
 *      front  --->指向队列第一个元素
 *      rear   --->指向队列最后一个元素
 *      arr[]  --->存储元素的数组
 *
 * 当队列为空条件： front = rear
 * 当队列满的条件：(rear+1) % maxSize = front
 * 队列的有效个数：(rear + maxSize - front) % maxSize
 */
class ArrayCircularQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayCircularQueue(int size){
        maxSize = size;
        arr = new int[size];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty(){
        return front == rear;
    }

    /**
     * 判读是否满
     */
    public boolean isFull(){
        return (rear+1) % maxSize == front;
    }

    /**
     * 添加元素
     */
    public void add(int value){

        if(isFull()){
            System.out.println("队列已满~~~");
            return;
        }

        arr [rear] = value;

        rear = (rear+1)%maxSize;
    }

    /**
     * 获取当前头元素
     * @return
     */
    public int get(){

        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }

        int value = arr[front];

        front = (front+1)%maxSize;

        return value;
    }

    /**
     * 查看头元素
     * @return
     */
    public int head(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }

        return arr[front];
    }

    /**
     * 查看队列所有元素
     *
     * front+(rear + maxSize - front) % maxSize ---> 当前位置起后面的有效数字
     */
    public void show(){
        for (int i = front; i <front+(rear + maxSize - front) % maxSize; i++) {
            System.out.printf("%d\t" ,arr[i]);
        }
    }


}
