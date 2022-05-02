package sorting.MergeSorting;

/**
 * @author: JoeyShelby
 * @date: 2022-05-02 09:51
 */
public class MergeSort {

    /**
     * 归并排序
     * @param nums 未排序数组
     * @param left
     * @param right
     * @param tmp
     */
    public static void mergeSort(Integer[] nums, int left, int right, Integer[] tmp) {
        if(left >= right) return;
        int mid = (left + right) / 2;
        //左分
        mergeSort(nums,left,mid,tmp);
        //右分
        mergeSort(nums,mid+1, right, tmp);
        //合并
        merge(nums,left,mid,right,tmp);
    }

    private static void merge(Integer[] nums, int left, int mid, int right, Integer[] tmp) {
        int l = left;   //左起始位置
        int r = mid + 1; //右起始位置
        int t = 0; //tmp数组指针

        //左右两边谁小谁往tmp里放，有一边全部放入tmp中为止
        while(l<=mid && r<=right) {
            if(nums[l] <= nums[r]) {
               tmp[t++] = nums[l++];
            } else {
                tmp[t++] = nums[r++];
            }
        }
        //有一边已经全部放到了tmp里了，则将另一方余下的元素放进tmp中去
        while(l <= mid) {
            tmp[t++] = nums[l++];
        }
        while(r <= right){
            tmp[t++] = nums[r++];
        }
        //将 tmp 中的所有元素拷贝到 nums 中的相应位置
        t = 0;
        l = left;
        while(l <= right) {
            nums[l++] = tmp[t++];
        }

    }
}
