package recursion;

import java.util.Arrays;

/**
 * 使用递归和回溯解决八皇后问题
 * 使用一维数组表示放置情况，下标表示行，值表示下标行所对应的列
 */
public class EightQueens {
    static int max = 8;  //几行几列
    static int[] board = new int[max];
    static int solveCount= 0;
    public static void main(String[] args) {
            put(0);
    }

    /**
     * 放置皇后
     * @param n 当前是在第几行放皇后
     */
    private static void put(int n) {
        //退出条件
        if(n == max){
            System.out.println(++solveCount+": "+Arrays.toString(board));
            return;
        }

        //依次放入皇后，看是否冲突
        for (int i = 0; i < max; i++) {
            board[n] = i;
            //检查当前行所放置的皇后是否合理
            if(check(n)) {
                //合理，放置下一行
                put(n+1);
            }
        }
    }

    /**
     * 检查当前放置皇后是否与之前放置的皇后有冲突
     * @param n
     * @return
     */
    private static boolean check(int n) {
        //检查列冲突    遍历每一行，看是否存在放置在相同列的皇后 board[i]==board[n
        //检查斜线冲突  检查之前放好的皇后，看两皇后连线的斜率是否等于1Math.abs(n-i)==Math.abs(board[n]-board[i])
        for (int i = 0; i < n; i++) {
            if(board[i]==board[n] || Math.abs(n-i)==Math.abs(board[n]-board[i])) {
                return false;
            }
        }
        return true;
    }
}
