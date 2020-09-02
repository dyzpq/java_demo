package sort;

import java.util.Arrays;

/**
 * @Author: dengyang
 * @Date: 2020/4/10 0010 9:53
 * 快速排序
 */
public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {-9,78,0,-23,-567,70};
        quickSort(arr,0,arr.length- 1);
        System.out.println(Arrays.toString(arr));
    }


    /**
     * 快速排序
     *      思路分析：
     *          例如：从小到大排序：
     *              1.设置两个指针和一个基准值，一个指针指向数组最左侧，一个指针指向数组最右侧，基准值我们可以设置为每次数组的最左侧元素
     *              2.先从右侧指针开始，每个指针对应的值与基准值进行比较，如果找到比基准值小的数字，将该数字赋值到左侧，即arr[l] = arr[r]
     *              3.然后从左侧指针开始，每个指针对应的值与基准值比较，如果知道比基准值大的数字，将数字赋值到右侧（这个位置原来值已设置到左侧），即arr[r] = arr[l]
     *              4.知道左侧的指针与右侧的指针位置相同后，将该位置设置为基准值（此位置之前的值已经赋值到其他地方--->赋值到了左侧）,即arr[l] = value
     *              5.然后进行迭代，左迭代：left--->之前的left，right--->l-1(l现在为基准位置)
     *                              右迭代：left--->l+1，right--->之前的right
     *
     *              注意：设置基准值为左侧时，必须先从右边开始与基准值进行比较，否则会出现排序错误！！！
     * @param arr 排序数组
     * @param left 最左侧索引
     * @param right 最右侧索引
     */
    public static void quickSort(int[] arr, int left,int right) {

        if(left < right){

            int l = left;
            int r = right;
            int value = arr[l];//基准值
            while (l < r) {

                //从右边开始，与基准值比较，直到找到小于基准值的数
                //基准值是左边第一个元素时，必须先从右侧开始!!!
                //如果从左侧开始，找到比基准值大的数字之后，放到右边，会导致右边之前的元素被覆盖，但之前右边的元素又没有存，导致排序错误
                //如果从右边开始，找到比基准值小的数字之后，会先放到第一个位置，虽然覆盖了该位置，但value已经存储了该值，不会影响
                while (l < r && arr[r] >= value){
                    r--;
                }
                arr[l] = arr[r];

                //从左边开始，与基准值比较，直到找到大于基准值的数
                while (l < r && arr[l] <= value){
                    l++;
                }
                arr[r] = arr[l];
            }

            arr[l] = value;


            quickSort(arr,left,l-1);
            quickSort(arr,l+1,right);
        }else {

            return;
        }

    }
}
