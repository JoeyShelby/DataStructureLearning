package sorting.shellSorting;

/**
 * @author: JoeyShelby
 * @date: 2022-04-29 17:33
 */
public class ShellSort {
    /**
     * 希尔排序
     * 在插入排序的基础上分组插入排序
     * @param nums
     * @return
     */
    public static Integer[] sort(Integer[] nums) {
        int size = nums.length;

        for(int gap=size/2; gap > 0; gap/=2) {
            for (int i = gap; i < size; i++) { //分别对每一个组进行插入排序
                int insertVal = nums[i];
                int insertIndex = i - gap;

                while(insertIndex>=0 && insertVal<nums[insertIndex]) {
                    nums[insertIndex+gap] = nums[insertIndex];
                    insertIndex-=gap;
                }

                nums[insertIndex+gap] = insertVal;
            }
        }

        return nums;
    }
}
