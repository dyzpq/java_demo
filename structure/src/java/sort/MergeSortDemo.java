package sort;

import java.util.Arrays;

/**
 * @Author: dengyang
 * @Date: 2020/4/10 0010 11:58
 * 归并排序
 */
public class MergeSortDemo {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 归并排序
     *
     * 思路分析:
     *      1.先将数组从中间分为两部分，在将这两个部分继续从中间分为两部分，直到最终分为的两部分都只有一个值，
     *      2.然后进行排序，设置两个指针，一个指针是左边第一位，另一个指针是中间位置后一个位置。
     *      3.两个指针对应的值进行比较，值小的放到临时数组中，然后将这个值小的指针后移
     *      4.新的两个指针位置继续进行比较，值小的放到临时数组中，直到到达设定的位置（左边的指针到达中间，右边的指针到达最右边）
     *      5.两个指针中某个指针到达指定位置后，另一个指针则将剩余的值放到临时数组中
     *      6.将临时数组的值放回到原数组中
     * @param arr
     */
    public static void sort(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int[] temp = new int[arr.length];//创建一个临时数组进行暂时存储
        sort(arr,left,right,temp);
    }


    /**
     * 先分开
     * @param arr
     * @param left
     * @param right
     * @param temp
     */
    public static void sort(int[] arr,int left,int right,int[] temp){
        if(left < right){
            int mid = (left+right)/2;
            sort(arr,left,mid,temp);//左迭代（左分）
            sort(arr,mid+1,right,temp);//右迭代（右分）
            merge(arr,left,mid,right,temp);//在排序合并
        }


    }

    /**
     * 后排序
     *
     * @param arr
     * @param left
     * @param mid
     * @param right
     * @param temp
     */
    public static void merge(int[] arr, int left,int mid, int right,int[] temp){

            int i = left;//数组左侧的开始位置
            int j = mid+1;//数组右侧的开始位置
            int t = 0;//临时数组的指针

            while (i <= mid && j<= right){

                //判断左边与右边的的大小关系，将小的放入到临时数组中
                if(arr[i] <= arr[j]){
                    temp[t++] = arr[i++];
                }else {
                    temp[t++] = arr[j++];
                }
            }

            //将左边剩余元素填充进temp中（这种情况表示右边的数值已全部放入到临时数组中）
            while(i<=mid){
                temp[t++] = arr[i++];
            }

            //将右序列剩余元素填充进temp中（这种情况表示左边的数值已全部放入到临时数组中）
            while(j<=right){
                temp[t++] = arr[j++];
            }

            //将临时数组放入到原数组中
            t = 0;
            while (left <= right){
                arr[left++] = temp[t++];

        }



    }
}
