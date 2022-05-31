package searching;

import java.net.Inet4Address;

/**
 * @author: JoeyShelby
 * @date: 2022-05-04 14:44
 */
public class BinarySearch {
    /**
     * 二分查找，要求进行查找的序列必须有序
     * @param nums
     * @param target
     * @param left
     * @param right
     * @return
     */
    public static Integer binarySearch(Integer[] nums, int target, int left, int right) {
        if(left>right){   //遍历完了整个数组，没有找到 target
            return -1;
        }
        int mid = (right+left)/2;

        if(nums[mid] < target) {
            return binarySearch(nums,target,mid+1,right);
        } else if(nums[mid] > target) {
            return binarySearch(nums,target,left,mid-1);
        } else {
            return mid;
        }
    }

    //不使用递归，使用红蓝边界的思路进行二分查找
    //思路见：https://joeyshelby.github.io/2022/03/04/%E4%BB%A3%E7%A0%81%E9%9A%8F%E6%83%B3%E5%BD%95-1-%E6%95%B0%E7%BB%84/
    public static Integer binarySearch2(Integer[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left+1 < right) {  //直到左右相撞，即确定了边界
            int m = (left+right)/2;

            if(nums[m] <= target) left = m;
            else right = m;
        }

        return left;
    }
}
