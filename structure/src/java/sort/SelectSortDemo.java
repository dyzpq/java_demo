package sort;

import java.util.Arrays;

/**
 * @Author: dengyang
 * @Date: 2020/4/8 0008 16:34
 * 选择排序
 *
 */
public class SelectSortDemo {
    public static void main(String[] args) {
        int[] arr = {101,34,119,1};
        selectSort(arr);
    }

    /**
     * 选择排序
     *
     * 思路分析：
     *      例如：从小到大排序：
     *            1.假设每次循环的第一个数字为最小值，记录下最小值和最小值的索引，将最小值与后面的数字进行比较，若找到更小的，则赋值给这个记录最小值的变量
     *            2.将每次循环的第一个数字与该最小值进行交换
     *            3.每次循环会确定一个最小值，次小值...
     *            4.所以需要控制j的最小值，每次需要增加
     * @param arr
     */
    public static void selectSort(int[] arr){

        //优化(如果没有交换，下面就不需要要进行交换值)
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {

            //存最小元素的下标
            int index = i;
            //存最小元素的值
            int minValue = arr[i];

            for (int j = i+1; j < arr.length; j++) {
                if(minValue > arr[j]){
                    flag = true;
                    index = j;
                    minValue = arr[j];
                }
            }

            //如果是true,说明需要交换值
            if(flag){
                arr[index] = arr[i];
                arr[i] = minValue;

                flag = false;

                System.out.println("第"+(i+1)+"次排序"+Arrays.toString(arr));
            }


        }


        /*//第一轮
        int index = 0;
        int minValue = arr[0];

        for (int j = 0+1; j < arr.length; j++) {
            if(minValue > arr[j]){
                index = j;
                minValue = arr[j];
            }
        }

        arr[index] = arr[0];
        arr[0] = minValue;
        System.out.println(Arrays.toString(arr));


        //第二轮
        index = 1;
        minValue = arr[1];

        for (int j = 1+1; j < arr.length; j++) {
            if(minValue > arr[j]){
                index = j;
                minValue = arr[j];
            }
        }

        arr[index] = arr[1];
        arr[1] = minValue;
        System.out.println(Arrays.toString(arr));


        //第三轮
        index = 2;
        minValue = arr[2];

        for (int j = 2+1; j < arr.length; j++) {
            if(minValue > arr[j]){
                index = j;
                minValue = arr[j];
            }
        }

        arr[index] = arr[2];
        arr[2] = minValue;
        System.out.println(Arrays.toString(arr));*/


    }
}
