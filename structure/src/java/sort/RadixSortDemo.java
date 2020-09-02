package sort;

import java.util.Arrays;

/**
 * @Author: dengyang
 * @Date: 2020/4/10 0010 15:30
 * 基数排序（桶排序的优化）
 */
public class RadixSortDemo {
    public static void main(String[] args) {
        int[] arr = {53,3,542,748,14,214};
        radixSort(arr);
    }

    /**
     * 基数排序：
     *      例如：从小到大排序：
     *          1.新建一个二维数组表示桶，int[10][arr.length] --->其中10表示桶的个数，arr.length表示每个桶中最多能够存储的元素个数
     *          2.新建一个一维数组，下标表示每个桶，值表示每个桶存放了几个数字
     *          3.循环取每位的数字（第一次循环个位，第二次循环取十位...），将对应的数字对应的值放入到对应的桶中（如53，取个位为3，则将53放入到3号桶中）
     *          4.每次循环将原数组的数字放完之后，在遍历桶，将数字再依次放入到原数组中
     * @param arr
     */
    public static void radixSort(int[] arr){

        //确认需要循环几次(找到最大值，最大值的位数即为循环次数)
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        int time = (max+"").length();

        //10表示有10个桶，每个桶最多存放的数字个数为arr.length
        int[][] bucket = new int[10][arr.length];


        //每个桶具体存放多少个数字，索引表示每个桶，值表示每个桶存放了几个数字
        int[] bucketNum = new int[10];
        //将桶中的数字放回原数组需要的索引
        int arrTemp = 0;

        //循环开始,这里的gap在下面获取每个位的数字时需要（个位，十位，百位）
        for(int i = 0 ,gap=1; i < time ; i++ ,gap *=10 ){

            for (int j = 0; j < arr.length; j++) {
                //找到对应位的数字
                int num = arr[j] /gap % 10;

                //放入到对应的桶中，且将对应桶的个数加1
                bucket[num][bucketNum[num]++] = arr[j];
            }

            //将数据放入到之前的数组
            for (int l = 0; l < bucket.length; l++) {
                //每个桶中有效数据个数是由bucketNum[l]控制的
                for (int m = 0;m < bucketNum[l]; m++){
                    arr[arrTemp++] = bucket[l][m];
                }
            }

            //重置索引
            arrTemp = 0;
            //重置需要存储每个桶中有效数字个数的数组
            bucketNum = new int[10];
            System.out.println(Arrays.toString(arr));

        }






        /*//第一轮
        //每个桶存放了几个数字
        bucketNum = new int[10];

        int arrTemp = 0;
        for (int j = 0; j < arr.length; j++) {
            //根据个位的值放数字
            int num = arr[j] % 10;

            bucket[num][bucketNum[num]++] = arr[j];
        }

        //将数据放入到之前的数组
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0;j < bucketNum[i]; j++){
                arr[arrTemp++] = bucket[i][j];
            }
        }

        System.out.println(Arrays.toString(arr));




        //第二轮
        bucketNum = new int[10];
        arrTemp = 0;
        for (int j = 0; j < arr.length; j++) {
            //根据个位的值放数字
            int num = arr[j] /10 % 10;

            bucket[num][bucketNum[num]++] = arr[j];
        }

        //将数据放入到之前的数组
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0;j < bucketNum[i]; j++){
                arr[arrTemp++] = bucket[i][j];
            }
        }

        System.out.println(Arrays.toString(arr));




        //第三轮
        bucketNum = new int[10];
        arrTemp = 0;
        for (int j = 0; j < arr.length; j++) {
            //根据个位的值放数字
            int num = arr[j] /100 % 10;

            bucket[num][bucketNum[num]++] = arr[j];
        }

        //将数据放入到之前的数组
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0;j < bucketNum[i]; j++){
                arr[arrTemp++] = bucket[i][j];
            }
        }

        System.out.println(Arrays.toString(arr));*/
    }
}
