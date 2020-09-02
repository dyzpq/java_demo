package sort;

import java.util.Arrays;

/**
 * @Author: dengyang
 * @Date: 2020/4/9 0009 14:06
 * 希尔排序
 * （分组进行排序，可以将极端的数字提前放到前面，比如最后一位是1，在插入排序时，需要循环的次数很多，利用这种分组的方式可以提前将这些极端数字放到前面来，且循环次数减少）
 */
public class ShellSortDemo {

    public static void main(String[] args) {
     int [] arr = {8,9,1,7,2,3,5,4,6,0};

     //移位法
     shellSort2(arr);
     //交换法
     //shellSort(arr);


    }

    /**
     * 希尔排序移位法（效率高）
     *
     * 思路分析：
     *      例如：从小到大排序：
     *          1.每次循环将该数组除以2得到步长gap
     *          2.得到步长之后，通过简单插入排序的方式进行排序，只是插入的步长不同
     * @param arr
     */
    public static void shellSort2(int[] arr){
        //第一层，确定分为几组，这样就可以确定需要比较数字的步长
        for(int gap = arr.length/2; gap >0 ; gap /=2){

            //实际上就是简单插入排序，只是和插入排序步长不同
            for(int i = gap; i< arr.length ; i++){

                int j = i-gap;
                int value = arr[i];

                while (j >= 0 && value <= arr[j]){
                    arr[j+gap] = arr[j];
                    j -= gap;
                }

                arr[j+gap] = value;
            }
            System.out.println(Arrays.toString(arr));
        }
    }


    /**
     * 希尔排序交换法（由于交换的次数很多次，效率很低）
     *
     * 思路分析：
     *      例如：从小到大排序：
     *          1.每次循环将该数组除以2得到步长gap
     *          2.得到步长之后，类似冒泡排序的方式进行交换排序，只是交换的步长不同
     * @param arr
     */
    public static void shellSort(int[] arr){
        int temp = 0;
        //第一层，确定分为几组，这样就可以确定需要比较数字的步长
        for(int gap = arr.length/2; gap >0 ; gap /=2){
            //实际上就是冒泡排序，只是对比交换的步长不同
            for(int i = gap; i< arr.length ; i++){

                for(int j = i-gap; j >=0; j -= gap){
                    if(arr[j] > arr[j+gap]){
                        temp = arr[j+gap];
                        arr[j+gap] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));

        }



        /*//第一轮
        //分为5组
        for(int i = 5; i< arr.length ; i++){
            for(int j = i-5; j >=0; j -= 5){
                if(arr[j] > arr[j+5]){
                    temp = arr[j+5];
                    arr[j+5] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));



        //第二轮
        for(int i = 2; i< arr.length ; i++){
            for(int j = i-2; j >=0; j -= 2){
                if(arr[j] > arr[j+2]){
                    temp = arr[j+2];
                    arr[j+2] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


        //第三轮
        for(int i = 1; i< arr.length ; i++){
            for(int j = i-1; j >=0; j -= 1){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/

    }





}
