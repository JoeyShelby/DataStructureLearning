package sorting.quickSorting;

/**
 * @author: JoeyShelby
 * @date: 2022-04-30 09:52
 */
public class QuickSort {
    /**
     * 快速排序
     * @param nums
     * @return
     */
    public static void sort(Integer[] nums, int left, int right) {
        if(left>=right) return;
        int l = left;
        int r = right;
        int pivot = nums[left];    //选取最左值为基准

        while(l < r) {  //交替填坑
            while(l<r && nums[r]>=pivot) r--;
            nums[l] = nums[r];

            while(l<r && nums[l]<=pivot) l++;
            nums[r] = nums[l];
        }
        nums[l] = pivot;  //当左右相遇，则基准回位

        sort(nums,left,r-1);
        sort(nums,l+1,right);
    }
}
