package sorting.MergeSorting.test;

import sorting.quickSorting.QuickSort;

import java.util.Arrays;

/**
 * @author: JoeyShelby
 * @date: 2022-04-30 10:01
 */
public class QuickSortTest {
    public static void main(String[] args) {
        Integer[] nums = {101, 34, 119, 1};
        QuickSort.sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
