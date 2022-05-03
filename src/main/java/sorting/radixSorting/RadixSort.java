package sorting.radixSorting;

/**
 * @author: JoeyShelby
 * @date: 2022-05-03 16:11
 */
public class RadixSort {
    /**
     * 基数排序
     * 基数排序不方便处理含有0和负数的待排序列
     * @param nums
     * @return
     */
    public static Integer[] sort(Integer[] nums) {
        int size = nums.length;
        //1.获得原数组中最大的数，并计算其位数
        int max = nums[0];
        for (int i = 1; i < size; i++) {
            if(nums[i] > max) max = nums[i];
        }
        int maxLength = 0; //计算最大数的位数
        while(max>0) {
            max/=10;
            maxLength++;
        }

        //2. 创建一个二维数组，表示10个桶，再创建一个一维数组，表示每个桶装了多少数
        int[][] buckets = new int[10][size];
        int[] bucketIndex = new int[10];

        //3. 进行基数排序
        int radix = 1;
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < size; j++) {
                int radixNum = (nums[j] / radix % 10);
                buckets[radixNum][bucketIndex[radixNum]++] = nums[j];
            }
            //将10个桶子里的数字按序放回原数组中
            int index = 0;
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < bucketIndex[j]; k++) {
                    nums[index++] = buckets[j][k];
                }
                bucketIndex[j] = 0;
            }
            radix*=10; //基数增大
        }

        return nums;
    }
}
