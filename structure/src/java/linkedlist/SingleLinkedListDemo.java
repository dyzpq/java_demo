package linkedlist;

import java.util.Stack;

/**
 * @Author: dengyang
 * @Date: 2020/3/30 0030 10:12
 * 单链表
 */
public class SingleLinkedListDemo {

    public static void main(String[] args) {


        HeroNode node1 = new HeroNode(1,"张三","小张");
        HeroNode node2 = new HeroNode(2,"李四","小李");
        HeroNode node3 = new HeroNode(3,"王五","小王");
        HeroNode node4 = new HeroNode(4,"赵六","小赵");

        SingleLinkedList singleLinkedList = new SingleLinkedList();

        //添加节点
        /*singleLinkedList.add(node1);
        singleLinkedList.add(node2);
        singleLinkedList.add(node3);
        singleLinkedList.add(node4);*/

        //按顺添加节点
        singleLinkedList.addByOrder(node1);
        singleLinkedList.addByOrder(node2);
        singleLinkedList.addByOrder(node3);
        singleLinkedList.addByOrder(node4);

        //打印链表
        /*System.out.println("原链表打印结果：");
        singleLinkedList.list(singleLinkedList.getHeadNode());


        //修改
        HeroNode node = new HeroNode(2,"李能","话痨");
        singleLinkedList.update(node);

        //打印链表
        System.out.println("修改后链表打印结果：");
        singleLinkedList.list(singleLinkedList.getHeadNode());


        //删除
        int no = 3;
        singleLinkedList.delete(no);

        //打印链表
        System.out.println("删除后链表打印结果：");
        singleLinkedList.list(singleLinkedList.getHeadNode());

        //节点个数
        int length = singleLinkedList.getLength(singleLinkedList.getHeadNode());
        System.out.println(length);

        //获取倒数节点
        int index = 2;
        HeroNode reverseIndexNode = singleLinkedList.getByReverseIndex(singleLinkedList.getHeadNode(), index);
        System.out.println("倒数第"+index+"个节点为："+reverseIndexNode);

        //反转
        *//*singleLinkedList.reserseList(singleLinkedList.getHeadNode());
        System.out.println("翻转后的链表打印结果：");
        singleLinkedList.list(singleLinkedList.getHeadNode());*//*

        //逆序打印
        System.out.println("逆序打印为：");
        singleLinkedList.resersePrint(singleLinkedList.getHeadNode());*/

        HeroNode node5 = new HeroNode(5,"孙悟空","小孙");
        HeroNode node6 = new HeroNode(6,"猪八戒","小猪");
        HeroNode node7 = new HeroNode(7,"沙和尚","小沙");
        HeroNode node8 = new HeroNode(8,"唐僧","小唐");

        SingleLinkedList singleLinkedList2 = new SingleLinkedList();

        singleLinkedList2.addByOrder(node5);
        singleLinkedList2.addByOrder(node6);
        singleLinkedList2.addByOrder(node7);
        singleLinkedList2.addByOrder(node8);

        HeroNode node = singleLinkedList.combineList(singleLinkedList.getHeadNode(),singleLinkedList2.getHeadNode());

        singleLinkedList.list(node);


    }
}

/**
 * 单链表类
 */
class SingleLinkedList{

    //需要一个头节点来确认该链表
    private HeroNode head = new HeroNode(0,"","");

    public HeroNode getHeadNode() {
        return head;
    }

    /**
     * 单链表节点添加
     * @param node
     */
    public void add(HeroNode node){
        //创建一个辅助变量
        HeroNode temp = head;

        //找到尾节点
        while (true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }

        //添加节点
        temp.next = node;
    }

    /**
     * 单链表按序添加（1.需要将编号排序，2.如果编号存在，则不允许添加）
     * @param node
     */
    public void addByOrder(HeroNode node){
        //创建一个辅助变量
        HeroNode temp = head;
        boolean flag = false;

        while (true){
            //尾节点
            if(temp.next == null){
                flag = true;
                break;
            }
            //找到插入点
            if(temp.next.no > node.no){
                flag = true;
                break;
            }
            //编号已存在
            if(temp.next.no == node.no){
                break;
            }

            temp = temp.next;
        }

        //进行赋值
        if(flag){
            if(temp.next == null){
               temp.next = node;
            }else {
                node.next = temp.next.next;
                temp.next = node;
            }
        }else {
            System.out.printf("%d编号已存在，无法添加\n",node.no);

        }
    }

    /**
     * 单链表节点修改
     * @param node
     */
    public void update(HeroNode node){
        //创建一个辅助变量
        HeroNode temp = head.next;
        boolean flag = false;

        while (true){
            //不存在该编号的节点
            if(temp == null){
                break;
            }
            //存在该编号
            if(temp.no == node.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }

        //设置值
        if(flag){
            temp.no = node.no;
            temp.name = node.name;
            temp.nikeName = node.nikeName;
        }else {
            System.out.printf("%d编号的节点不存在，无法修改",node.no);
        }

    }

    /**
     * 单链表节点删除
     * @param no
     */
    public void delete(int no){
        //创建一个辅助变量
        HeroNode temp = head;
        boolean flag = false;

       while (true){
           //该编号不存在
           if(temp.next == null){
               break;
           }
           //该编号存在
           if(temp.next.no == no){
               flag = true;
               break;
           }
           temp = temp.next;
       }

       if(flag){
           temp.next = temp.next.next;
       }else {
           System.out.println(System.out.printf("%d编号的节点不存在，无法删除",no));
       }
    }

    /**
     * 单链表遍历
     * @param headNode
     */
    public void list(HeroNode headNode){
        if(headNode.next == null){
            System.out.println("链表为空~~~");
        }

        HeroNode temp = headNode.next;
        while (temp != null){

            System.out.println(temp.toString());

            temp = temp.next;
        }
    }


    /**
     * 获取链表的有效个数
     * @param headNode
     * @return
     */
    public int getLength(HeroNode headNode){
        HeroNode temp = headNode.next;
        int length = 0;

        //遍历获取有效个数
        while (temp != null){
             length++;
            temp = temp.next;

        }
        return length;
    }

    /**
     * 新浪面试题：获取单链表倒数第index的节点
     * @param headNode
     * @param index
     * @return
     */
    public HeroNode getByReverseIndex(HeroNode headNode, int index){
        if(headNode.next == null){
            return null;
        }

        //创建一个辅助变量
        HeroNode temp = headNode;
        //先获取节点个数
        int length = this.getLength(headNode);
        //获取倒数第index的节点相当于是获取正数第length-index的节点
        //先判断是否在范围内
        if(index <= 0 || index > length){
            throw new RuntimeException("outOfIndexException");
        }
        //获取节点
        int count = 0;
        while (true){
            if(count == length-index+1){
                return temp;
            }
            count++;
            temp = temp.next;
        }
    }

    /**
     * 腾讯面试题：将链表翻转(创建一个新的头节点，将原链表节点依次插入到头结点后面)
     * @param headNode
     */
    public void reserseList(HeroNode headNode){
        //无需反转
        if(headNode.next == null || headNode.next.next == null){
            return;
        }

        //创建一个辅助节点存储当前节点
        HeroNode cur = headNode.next;
        //创建一个辅助节点存储当前节点的下一个节点（这里为什么需要使用一个next节点的原因：cur.next会被赋值,赋值之后原来的链表就无法获取下一个节点，所有需要预先存储）
        HeroNode next  = null;
        //创建一个新节点头
        HeroNode reserseHead = new HeroNode(0,"","");

        while (cur != null){

            next = cur.next;
            //插入后一个节点到新节点头的后面
            cur.next = reserseHead.next;
            reserseHead.next = cur;

            cur = next;
        }

        headNode.next = reserseHead.next;
    }

    /**
     * 百度面试题：将单链表逆序打印
     * @param headNode
     */
    public void resersePrint(HeroNode headNode){
        if(headNode.next == null){
            System.out.println("链表为空~~~");
        }

        HeroNode cur = headNode.next;
        //创建栈，后进先出可以实现逆序打印
        Stack<HeroNode> stack = new Stack<>();
        //将值放入到stack中
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }

        //打印
        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }

    /**
     * 合并有序链表
     * @param headNode1
     * @param headNode2
     * @return
     */
    //todo（当两个链表出现相同节点时有问题）
    public HeroNode combineList(HeroNode headNode1,HeroNode headNode2) {
        if(headNode1 == null){
            return headNode2;
        }
        if(headNode2 == null){
            return headNode1;
        }

        //对应的辅助变量
        HeroNode cur1 = headNode1.next;
        HeroNode cur2 = headNode2.next;

        HeroNode headNode;
        HeroNode temp;

        if(headNode1.next.no <= headNode2.next.no){
            temp = headNode1;
        }else {
            temp = headNode2;
        }
        headNode = temp;

        //遍历进行数据比较，再加入到新的链表中
        while (cur1 != null && cur2 != null){
           if(cur1.no <= cur2.no){
               temp.next = cur1;
               cur1 = cur1.next;
           }else {
               temp.next = cur2;
               cur2 = cur2.next;
           }
           temp = temp.next;
        }

        if(cur1 == null){
            temp.next = cur2;
        }
        if (cur2 == null){
            temp.next = cur1;
        }

        return headNode;

    }

}


/**
 * 单链表的节点类
 */
class HeroNode{
    public int no;
    public String name;
    public String nikeName;
    public HeroNode next;

    public HeroNode(int no,String name,String nikeName){
        this.no = no;
        this.name = name;
        this.nikeName = nikeName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nikeName='" + nikeName + '\'' +
                '}';
    }
}
