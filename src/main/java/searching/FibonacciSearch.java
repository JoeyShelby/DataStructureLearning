package searching;

import java.util.Arrays;

/**
 * @author: JoeyShelby
 * @date: 2022-05-04 15:33
 * fibonacci 查找，在二分查找的基础上对 mid 进行一些改进，以达到“黄金比例”
 */
public class FibonacciSearch {
    private static final int fibLength = 30;


    public static Integer fibonacciSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = 0; //斐波那契数组的下标
        int[] fib = fib();

        while (right + 1 > fib[index]) {
            index++;
        }
        int[] tmp = Arrays.copyOf(nums, fib[index]);
        for (int i = right; i < fib[index]; i++) {
            tmp[i] = nums[right];
        }

        while (left <= right) {
            int mid = left + fib[index - 1] - 1;

            if (tmp[mid] < target){
                left = mid + 1;
                index-=2;
            }
            else if (tmp[mid] > target){
                right = mid - 1;
                index-=1;
            }
            else return mid;
        }

        return -1;
    }

    //得到一个 Fibonacci 数组
    private static int[] fib() {
        int[] fib = new int[30];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < fibLength; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }
}
