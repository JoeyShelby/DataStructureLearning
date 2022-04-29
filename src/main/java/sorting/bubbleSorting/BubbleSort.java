package sorting.bubbleSorting;

/**
 * @author: JoeyShelby
 * @date: 2022-04-29 15:09
 */

/**
 * 冒泡排序
 */
public class BubbleSort {
    /**
     * 一般的冒泡排序
     * 在排序过程中，若序列已经有序，下面的程序还会依旧执行，浪费时间
     * @param nums
     * @return
     */
    public static Integer[] bubbleSort(Integer[] nums) {
        int size = nums.length;
        for(int i=0; i < size - 1; i++ ) {
            for(int j = 1; j < size - i; j++) {
                if(nums[j-1] > nums[j]) {
                    int tmp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }
}
