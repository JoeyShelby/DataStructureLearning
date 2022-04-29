package sorting.bubbleSorting;

/**
 * @author: JoeyShelby
 * @date: 2022-04-29 15:26
 */
public class BubbleSortBetter {
    /**
     * 优化的冒泡排序
     * 若在排序执行中，待排序序列已经有序，则无需再进行冒泡，此时应当退出排序
     * @param nums
     * @return
     */
    public static Integer[] bubbleSort(Integer[] nums) {
        int size = nums.length;
        boolean flag = false;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                if(nums[j-1] > nums[j]) {
                    int tmp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = tmp;
                    flag = true;   //发生了替换，做标记
                }
            }
            if(!flag) break;
            flag = false;
        }

        return nums;
    }
}
