package searching;

/**
 * @author: JoeyShelby
 * @date: 2022-05-04 15:18
 */
public class InterpolationSearch {
    /**
     * 差值查找，在二分查找的基础上进行了优化
     *
     * @param nums
     * @param target
     * @param left
     * @param right
     * @return
     */
    public static Integer interpolationSearch(Integer[] nums, int target, int left, int right) {
        if (left > right) return -1; //遍历完整个数组，找不到 target

        int mid = left + ((right - left) / (nums[right] - nums[left])) * (target - nums[left]);
        System.out.println("nums[mid]:" + nums[mid]);

        if (nums[mid] < target) {
            return interpolationSearch(nums, target, mid + 1, right);
        } else if (nums[mid] > target) {
            return interpolationSearch(nums, target, left, mid - 1);
        } else {
            return mid;
        }
    }
}
