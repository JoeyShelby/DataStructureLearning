package recursion;

import java.util.Arrays;

/**
 * 使用递归回溯解决迷宫问题
 * 从[1][1] 出发，到达[6][6]
 */
public class Maze {
    public static void main(String[] args) {
        //创建二维数组，模拟迷宫，并设置挡板
        int[][] maze = new int[8][8];
        for(int i = 0; i < 8 ;i++) {
            maze[0][i] = 1;
            maze[7][i] = 1;
            maze[i][0] = 1;
            maze[i][7] = 1;
        }
        maze[3][1] = 1;
        maze[3][2] = 1;
        maze[3][3] = 1;
        maze[2][3] = 1;
        maze[1][3] = 1;


        for (int[] ints : maze) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("----------------------------");

        findWay(maze, 1, 1);

        //查看结果
        for (int[] ints : maze) {
            for (int anInt : ints) {
                System.out.print(anInt+"  ");
            }
            System.out.println();
        }
    }

    /**
     * 找到走迷宫的路径
     * @param maze
     * @param i
     * @param j
     * @return
     */
    private static boolean findWay(int[][] maze, int i, int j) {
        if(maze[6][6] == 2) return true; //已经到达终点
        else {
            if(maze[i][j] == 0) { //该点可走
                maze[i][j] = 2; //走该点，并标记
                if(findWay(maze, ++i, j)) return true;
                else if(findWay(maze, i, ++j)) return true;
                else if(findWay(maze, --i, j)) return true;
                else if(findWay(maze, i, --j)) return true;
                else {
                    maze[i][j] = 3; //上下左右都走不通
                    return false;
                }
            }
            else return false; //该点不可走
        }
    }
}
