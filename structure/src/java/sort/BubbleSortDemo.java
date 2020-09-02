package sort;

import java.util.Arrays;

/**
 * @Author: dengyang
 * @Date: 2020/4/8 0008 16:06
 * 冒泡排序
 */
public class BubbleSortDemo {
    public static void main(String[] args) {

        int[] arr = {3,9,-1,10,20};
        bubbleSort(arr);

    }

    /**
     * 冒泡排序
     *
     * 思路分析：
     *     例如：从小到大排序：
     *           1.循环数组两两比较，若前数大于后数，则交换两个的位置
     *           2.每次循环确认一个最大数放到最后（第一次循环--->最大值，第二次循环--->次大值...）
     *           3.所以需要控制j的最大值，每次需要减小
     * @param arr
     */
    public static void bubbleSort(int[] arr){

        //辅助变量
        int temp = 0;

        //优化(给一个标识，若某次排序所有元素的位置都没有改变，说明已排序成功，则不再需要排序)
        boolean flag = false;

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    //说明顺序已修改,需要继续排序
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            System.out.println("第"+(i+1)+"次排序"+Arrays.toString(arr));

            //如果未修改过，则说明已排序成功，若修改，则重置标识
            if(!flag){
                return;
            }else {
                flag = false;
            }
        }

        /*//第一轮
        for (int j = 0; j < arr.length-1-0; j++) {
            if(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

        //第二轮
        for (int j = 0; j < arr.length-1-1; j++) {
            if(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

        //第三轮
        for (int j = 0; j < arr.length-1-2; j++) {
            if(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));


        //第四轮
        for (int j = 0; j < arr.length-1-3; j++) {
            if(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));*/
    }
}
