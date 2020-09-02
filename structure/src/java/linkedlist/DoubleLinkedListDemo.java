package linkedlist;

/**
 * @Author: dengyang
 * @Date: 2020/3/31 0031 10:05
 * 双向链表
 */
public class DoubleLinkedListDemo {
    public static void main(String[] args) {

        Node node1 = new Node(1,"张三","小张");
        Node node2 = new Node(2,"李四","小李");
        Node node3 = new Node(3,"王五","小王");
        Node node4 = new Node(4,"赵六","小赵");

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        /*doubleLinkedList.add(node1);
        doubleLinkedList.add(node2);
        doubleLinkedList.add(node3);
        doubleLinkedList.add(node4);*/

        doubleLinkedList.addByOrder(node1);
        doubleLinkedList.addByOrder(node3);
        doubleLinkedList.addByOrder(node2);
        doubleLinkedList.addByOrder(node4);

        System.out.println("原来的链表为：");
        doubleLinkedList.list(doubleLinkedList.getHead());

        Node node = new Node(3,"李能","话痨");
        doubleLinkedList.update(node);
        System.out.println("修改后的链表为：");
        doubleLinkedList.list(doubleLinkedList.getHead());

        int no = 4;
        doubleLinkedList.delete(no);
        System.out.println("删除后的链表为：");
        doubleLinkedList.list(doubleLinkedList.getHead());

    }
}


/**
 * 双向链表
 */
class DoubleLinkedList{
    private Node head = new Node(0,"","");

    public Node getHead() {
        return head;
    }

    /**
     * 新增节点
     * @param node
     */
    public void add(Node node){
        //新建一个辅助变量
        Node temp = head;

        //遍历找到尾结点
        while (temp.next != null){

            if(temp.next == null){
                break;
            }

            temp = temp.next;
        }

        //添加值
        temp.next = node;
        node.pre = temp;
    }

    /**
     * 按序新增节点
     * @param node
     */
    public void addByOrder(Node node){
        //新建一个辅助节点
        Node temp = head;
        boolean flag = false;

        while (true){
            if(temp.next == null){
                flag = true;
                break;
            }

            if(temp.next.no == node.no){
                break;
            }

            if(temp.next.no > node.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if(flag){
            if(temp.next == null){
                temp.next = node;
                node.pre = temp;
            }else {
                node.next = temp.next;
                node.pre = temp;
                temp.next.pre = node;
                temp.next = node;
            }
        }else {
            System.out.printf("%d编号已存在，无法添加",node.no);
        }

    }

    /**
     * 修改节点
     * @param node
     */
    public void update(Node node){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }

        //辅助变量
        Node temp = head.next;

        while (true){
            if(temp == null){
                System.out.println("该节点不存在");
                return;
            }

            if(temp.no == node.no){
                temp.name = node.name;
                temp.nikeName = node.nikeName;
                return;
            }

            temp = temp.next;
        }
    }

    /**
     * 删除节点
     * @param no
     */
    public void delete(int no){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }

        Node temp = head.next;

        while (true){
            if(temp == null){
                System.out.printf("%d节点不存在\n",no);
                return;
            }

            if(temp.no == no){
                temp.pre.next = temp.next;

                //需要加这个判断，如果不加在尾端会出现空指针
                if(temp.next != null){
                    temp.next.pre = temp.pre;
                }

                return;
            }

            temp = temp.next;
        }
    }

    /**
     * 遍历链表
     * @param headNode
     */
    public void list(Node headNode){
        if(headNode.next == null){
            System.out.println("链表为空~~~");
            return;
        }

        //新建一个辅助变量
        Node temp = head.next;

        while (true){
            //已到结尾
            if(temp == null){
                break;
            }

            System.out.println(temp);

            temp = temp.next;
        }

    }
}

/**
 * 双链表的节点
 */
class Node{
    public int no;
    public String name;
    public String nikeName;
    public Node next;
    public Node pre;

    public Node(int no,String name,String nikeName){
        this.no = no;
        this.name = name;
        this.nikeName = nikeName;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nikeName='" + nikeName + '\'' +
                '}';
    }
}
