package linkedlist;

/**
 * @Author: dengyang
 * @Date: 2020/3/31 0031 11:48
 * 约瑟夫问题
 */
public class JosephDemo {

    public static void main(String[] args) {
        CircleLinkedList circleLinkedList = new CircleLinkedList();

        //circleLinkedList.add(5);
        //circleLinkedList.list();

        int startNo = 1;
        int interval = 2;
        int nums = 5;
        circleLinkedList.outData(1,2,5);
    }
}

class CircleLinkedList{

    private MyNode first =null;

    /**
     * 添加数据
     * @param nums
     */
    public void add(int nums){
        //数据校验
        if(nums <=0){
            System.out.printf("传入数字%d不正确",nums);
            return;
        }

        //需要一个辅助指针
        MyNode cur = null;

        for (int i = 1; i <= nums; i++) {
            MyNode myNode = new MyNode(i);
            //当第一次时，需要将first指向第一个节点
            if(i==1){
               first = myNode;
               cur = myNode;
               cur.next = first;
            }else {
                cur.next = myNode;
                myNode.next = first;
            }
            cur = cur.next;
        }
    }


    /**
     * 遍历环形链表
     */
    public void list(){
        if(first == null){
            System.out.println("环形链表不存在");
            return;
        }

        //辅助变量
        MyNode cur = first;

        while (true){

            System.out.printf("数据为：%d\n",cur.data);

            if(cur.next == first){
                return;
            }

            cur = cur.next;
        }
    }

    /**
     * 约瑟夫问题拿出数据
     * @param startNo
     * @param interval
     * @param nums
     */
    public void outData(int startNo, int interval, int nums){
        //数据校验
        if(startNo > nums || startNo<=0 || interval <= 0){
            System.out.println("传入数据有问题");
            return;
        }
        //创建数据
        this.add(nums);

        //辅助指针(让辅助指针指向最后一个数据)
        //为什么需要这个指针---->这个指针和first指针同时存在可以很好得判断当前的位置，方便进行移除链表中的节点操作.若只剩一个节点，通过这两个指针可以很好的额判断
        MyNode helper = first;

        //遍历使其指向最后一个
        while (true){
            if(helper.next == first){
                break;
            }
            helper = helper.next;
        }

        while (true){

            if(helper == first){
                break;
            }

            //拿数据
            for (int i = 0; i < interval-1; i++) {
                first = first.next;
                helper = helper.next;
            }

            System.out.println("拿出得数据为："+first.data);

            first = first.next;
            helper.next = first;
        }

        System.out.println("未拿出的数据未："+first.data);
    }
}

/**
 * 节点类
 */
class MyNode{
    public int data;
    public MyNode next;

    public MyNode(int data){
        this.data = data;
    }
}
