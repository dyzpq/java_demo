package sparse;

import java.io.*;

/**
 * @Author: dengyang
 * @Date: 2020/3/27 0027 18:04
 *
 * 稀疏数组
 */
public class SparseArrayDemo {

    public static void main(String[] args) {

        //创建二维数组并赋值
        int[][] chessArray = new int[5][5];
        chessArray[1][2] = 3;
        chessArray[3][4] = 8;
        chessArray[4][4] = 10;

        //打印二维数组
        System.out.println("原二维数组打印为：");
        printArray(chessArray);
        System.out.println();


        //二维数组转换为稀疏组数
        int[][] sparseArray = chessArray2SparseArray(chessArray);
        System.out.println("稀疏数组打印为：");
        printArray(sparseArray);
        //输出到文件
        //writeOut(sparseArray);

        //从文件读取
        System.out.println("文件中读入的稀疏数组：");
        String fileName = "E:\\study\\file\\sparseArray.txt";
        int[][] readIn = readIn(fileName);
        printArray(readIn);
        System.out.println();


        //稀疏数组转换为二维数组
        int[][] chessArray1 = sparseArray2chessArray(sparseArray);
        System.out.println("恢复后二维数组为：");
        printArray(chessArray1);
    }


    /**
     * 二维数组转稀疏数组
     * 1.二维数组的行数，列数，有效数字(不为0则为有效数字)个数为稀疏数组的第一行,  其中稀疏数组的行数为有效数字个数+1,列数为数组维度+1
     * 例如：二维数组的行数为5，列数为5，有效个数为3
     *
     * 则有稀疏数列 sparseArray[4][3]
     *
     * 稀疏数组第一行值为：
     *             sparseArray[0][0] = 5
     *             sparseArray[0][1] = 5
     *             sparseArray[0][2] = 3
     *
     * 2.二维数组的每个有效数据的位置和值 为稀疏数组的其他行
     *例如二维数组第二行，第三列有一个数字3
     *
     * 稀疏数组其他行为：
     *
     *              sparseArray[1][0] = 1
     *              sparseArray[1][1] = 2
     *              sparseArray[1][2] = 3
     *
     * 二维数组                         稀疏数组
     * 0    0   0   0   0               5   5   3
     * 0    0   3   0   0               1   2   3
     * 0    0   0   0   0    ------>    3   4   8
     * 0    0   0   0   8               4   4   10
     * 0    0   0   0   10
     *
     *
     * @param chessArray
     * @return
     */
    static int[][] chessArray2SparseArray(int[][] chessArray){

        //先得到二维数组的有效个数，以便创建稀疏数组
        int sum = 0;
        for (int[] ints : chessArray) {
            for (int anInt : ints) {
                if(anInt != 0){
                    sum++;
                }
            }
        }

        //创建稀疏数组
        int count = 0;
        int[][] sparseArray = new int[sum+1][3];

        sparseArray[0][0] = 5;
        sparseArray[0][1] = 5;
        sparseArray[0][2] = sum;

        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                if(chessArray[i][j] != 0){
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray[i][j];
                }
            }
        }

        return sparseArray;
    }

    /**
     * 将稀疏数组放入到本地文件中
     * @param sparseArray
     */
    static void writeOut(int[][] sparseArray){
        File file = null;
        FileWriter out = null;
        try {
            file = new File("E:\\study\\file\\sparseArray.txt");
            out = new FileWriter(file);

            for (int i = 0; i < sparseArray.length; i++) {
                for (int j = 0; j < sparseArray[i].length; j++) {
                    out.write(sparseArray[i][j]+"\t");
                }
                out.write("\r");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                out.close();
                System.out.println("文件保存完毕");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * 稀疏数组转换为二维数组
     * 1.稀疏数组第一行前两位值分别是二维数组的大小
     *
     * 例如稀疏数组第一行前两位数为：5  5
     *
     * 则二维数组为chessArray[5][5]
     *
     * 2.稀疏数组的其他行前两位值对应是二维数组的下标，第三位是二维数组的值
     *
     * 例如稀疏数组第二行的三位数字分别为： 2  3  4
     *
     * 则有chessArray[2][3] = 4
     *
     * 稀疏数组：
     * 5    5   3               0   0   0   0   0
     * 1    2   3      =====>   0   0   3   0   0
     * 3    4   8               0   0   0   0   0
     * 4    4   10              0   0   0   0   8
     *                          0   0   0   0   10
     *
     * @param sparseArray
     * @return
     */
    static int[][] sparseArray2chessArray(int[][] sparseArray){
        int row = sparseArray[0][0];
        int col = sparseArray[0][1];

        //创建二维数组
        int[][] chessArray = new int[row][col];

        //二维数组赋值
        for (int i = 1; i < sparseArray.length; i++) {
            int row1 = sparseArray[i][0];
            int col1 = sparseArray[i][1];
            int val1 = sparseArray[i][2];

            chessArray[row1][col1] = val1;
        }
        return chessArray;
    }

    /**
     * 从文件中读取文件到数组中
     * @param fileName
     * @return
     */
    static int[][] readIn(String fileName){
        File file  = null;
        BufferedReader in = null;
        int[][] sparseArray = new int[4][3];
        try {
            file = new File(fileName);
            in = new BufferedReader(new FileReader(file));

            String line;
            int row = 0;

            //逐行取出
            while ((line = in.readLine()) != null){
                String[] split = line.split("\t");
                //逐行取出放入到数组中
                for (int i = 0; i < split.length; i++) {
                    sparseArray[row][i] = Integer.parseInt(split[i]);
                }
                row++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sparseArray;
    }

    /**
     * 打印数组
     * @param array
     */
    static void printArray(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }
    }
}
