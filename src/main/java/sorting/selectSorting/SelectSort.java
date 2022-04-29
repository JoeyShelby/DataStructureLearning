package sorting.selectSorting;

/**
 * @author: JoeyShelby
 * @date: 2022-04-29 16:05
 */

/**
 * 选择排序算法 :
 * 1. 从 [0,n) 中选出最小值，与 nums[0] 交换
 * 2. 从 [1,n) 中选出最小值，与 nums[1] 交换
 * 3. 从 [2,n) 中选出最小值，与 nums[2] 交换
 * ...
 * ...
 */
public class SelectSort {

    public static Integer[] selectSort(Integer[] nums) {
        int size = nums.length;

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i; //当前范围内的最小值的索引
            for (int j = i+1; j < size; j++) {
                if(nums[j] < nums[minIndex]) minIndex = j;
            }
            int tmp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = tmp;
        }

        return nums;
    }
}
