package recursion;

/**
 * @Author: dengyang
 * @Date: 2020/4/7 0007 14:33
 * 八皇后问题
 */
public class QueenDemo {

    int max = 8;
    //创建一个一维数组，数组的下标表示行（若为0，表示第一个皇后），数组的值表示列（某个皇后放的位置）
    int[] arr = new int[max];

    static int count = 0;

    public static void main(String[] args) {
        QueenDemo queenDemo = new QueenDemo();
        queenDemo.setFlag(0);
        System.out.println(count);
    }


    /**
     * 棋盘放置
     *
     * 思路分析：
     *      1.创建一个一维数组，数组的下标表示行（若为0，表示第一个皇后），数组的值表示列（某个皇后放的位置）
     *      2.第一个皇后放在第一行第一列
     *      3.第二个皇后放在第二行、然后判断是否ok，如果不ok，继续放第二列，第三列，依次把所有列都放完，找到一个合适的位置
     *      4.继续第三个皇后，还是第一列、第二列......直到第8个皇后也能放在一个不冲突的位置，算是找到了一个正确解
     *      5.当得到一个正确解时，在栈退回到上一个栈时，就会开始回溯，即将第一个皇后，放到第一列的所有正确解，全部得到
     *      6.然后回头继续第一个皇后放第二列，后面继续循环执行2，3，4，5的步骤
     *
     *  @param n
     */
    public void setFlag(int n){

        if(n == 8){
            count++;
            print();
            return;
        }

        //确认每个皇后放在哪一列
        for (int i = 0; i < 8 ; i++) {
            //先确认第n个皇后的位置
            arr[n] = i;
            //判断该皇后的位置与之前的皇后是否冲突
            if(judge(n)){
                //如果不冲突则继续放下一个皇后
                setFlag(n+1);
            }
        }

    }

    /**
     *
     * @param n 当前的行数
     * @return
     *
     */
    public boolean judge(int n){
        for (int i = 0; i < n; i++) {
            //判断是否在同一行或者对角线上
            if(arr[i] == arr[n] || Math.abs(n-i) == Math.abs(arr[n] - arr[i])){
                return false;
            }
        }
        return true;
    }

    /**
     * 打印
     */
    public void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


