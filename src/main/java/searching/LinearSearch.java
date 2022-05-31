package searching;

/**
 * @author: JoeyShelby
 * @date: 2022-05-04 14:36
 */
public class LinearSearch {
    /**
     * 线性（顺序）查找，适合未排序的数据
     * 时间复杂度为O(n)
     * @param nums
     */
    public static Integer linearSearch(Integer[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) return i;
        }
        return -1;  //找不到则返回-1
    }
}
