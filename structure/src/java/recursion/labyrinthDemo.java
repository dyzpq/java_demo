package recursion;

/**
 * @Author: dengyang
 * @Date: 2020/4/3 0003 11:08
 * 迷宫问题
 */
public class labyrinthDemo {

    public static void main(String[] args) {
        int[][] map = new int[8][8];

        //第一行和最后一行设置为1
        for (int j = 0; j < 8; j++) {
            map[0][j] = 1;
            map[7][j] = 1;
        }

        //每一列设置为1
        for (int i = 0; i < 8; i++) {
             map[i][0] = 1;
             map[i][7] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;


        System.out.println("走之前的迷宫：");
        print(map);

        setWay(map,1,1);
        System.out.println("走之后的迷宫：");
        print(map);

    }


    /**
     *
     * @param map
     * @param i
     * @param j
     * @return
     *
     * 思路分析：
     *     1.创建一个8*8的二维数组
     *     2.从map[1][1]的位置开始走，按照下右上左的方向走，直到走到map[6][6]算是成功
     *     3.规定：1--->墙   2--->已走过的路   3--->走过但走不通的路
     *     4。如果走的路是0，表示该路可以试走，如果是其他数字，则不应该再去试着走一次
     */
    public static boolean setWay(int[][] map ,int i,int j){
        //如果已经走到终点，则成功
        /*if(i==6 && j == 6){
            return true;*/
        if(map[6][6] == 2){
            return true;
        }else {
            if(map[i][j]==0){
                //先将当前位置设置为2，假定路可走
                map[i][j] = 2;
                //按照下右上左的方向走
                if(setWay(map,i+1,j)){
                    return true;
                }else if(setWay(map,i,j+1)){
                    return true;
                }else if (setWay(map,i-1,j)){
                    return true;
                }else if(setWay(map,i-1,j)){
                    return true;
                }else {
                    //如果都走不通则当前位置设置为3
                    map[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }

    /**
     * 打印
     * @param map
     */
    public static void print(int[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.printf("%d\t",map[i][j]);
            }
            System.out.println();
        }
    }
}

