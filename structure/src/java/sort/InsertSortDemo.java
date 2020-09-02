package sort;

import java.util.Arrays;

/**
 * @Author: dengyang
 * @Date: 2020/4/8 0008 16:53
 * 插入排序
 */
public class InsertSortDemo {
    public static void main(String[] args) {
        int[] arr = {101,34,119,1};
        insertSort(arr);
    }

    /**
     * 插入排序：
     *
     * 思路分析：
     *      例如：从小到大排序：
     *          1.从某个下标开始，将当前下标的值与该下标之前的值依次比较
     *          2.若该值小于之前的值，则将之前的值后移一位（这里需要注意索引小于0判断）
     *          3.直到找到大于该值的位置，将该值放到这个值得后面位置
     *          4.所以需要控制j的最小值，每次需要增加
     * @param arr
     */
    public static void insertSort(int[] arr){

        int j = 0;//需要插入数据的前一个数字(需要与之前的对比)
        int value = 0;//需要插入的数据

        for (int i = 1; i < arr.length; i++) {

            j =i-1;
            value = arr[i];

            //两个条件，一个是防止不越界，一个是找到插入点位置
            while (j >= 0 && value < arr[j]){
                //未找到插入位置，则将前一个数据后移一位
                arr[j + 1] = arr[j];
                j--;
            }

            //优化，判定insertIndex+1的值是否为i，如果为i，则不需要赋值
            if (!(j+1 == i)) {

                //找到位置之后，插入值（这里为什么需要加1?因为如果找到小于待插入数值之后，需要在该数值的后一位插入，而不是找到的位置插入）
                arr[j + 1] = value;

                System.out.println("第"+i+"轮插入"+Arrays.toString(arr));
            }

        }

        /*//第一轮
        int insertIndex =0;//需要插入数据的前一个数字(需要与之前的对比)
        int insertValue = arr[1];

        while (insertIndex >=0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            insertIndex--;
        }

        arr[insertIndex+1] = insertValue;

        System.out.println(Arrays.toString(arr));



        //第二轮
        insertIndex =1;//需要插入数据的前一个数字(需要与之前的对比)
        insertValue = arr[2];

        while (insertIndex >=0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            insertIndex--;
        }

        arr[insertIndex+1] = insertValue;

        System.out.println(Arrays.toString(arr));



        //第三轮
        insertIndex =2;//需要插入数据的前一个数字(需要与之前的对比)
        insertValue = arr[3];

        while (insertIndex >=0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            insertIndex--;
        }

        arr[insertIndex+1] = insertValue;

        System.out.println(Arrays.toString(arr));*/
    }
}
