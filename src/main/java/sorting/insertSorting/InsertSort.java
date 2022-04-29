package sorting.insertSorting;

/**
 * @author: JoeyShelby
 * @date: 2022-04-29 16:43
 */
public class InsertSort {
    /**
     * 插入排序，将当前所遍历到的元素插入到序列中有序部分的相应位置
     * @param nums
     * @return
     */
    public static Integer[] sort(Integer[] nums) {
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            int insertVal = nums[i];
            int insertIndex = i - 1;

            while(insertIndex>=0 && insertVal<nums[insertIndex]) {
                nums[insertIndex +1] = nums[insertIndex];
                insertIndex--;
            }
            // 直到找到一个数小于当前元素，便可以将当前元素插在这个数之后
            nums[insertIndex+1] = insertVal;
        }

        return nums;
    }
}
