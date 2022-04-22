package recursion;

/**
 * 递归计算斐波那契数列 1、1、2、3、5、8、13、21、34、……
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(calculate(6));
    }

    public static int calculate(int n) {
        if(n==1) {
            return 1;
        }
        if(n==2) {
            return 1;
        }
        return calculate(n-1) + calculate(n-2);
    }
}
