package sorting.MergeSorting.test;

import sorting.MergeSorting.MergeSort;

import java.util.Arrays;

/**
 * @author: JoeyShelby
 * @date: 2022-05-02 10:15
 */
public class MergeSortTest {
    public static void main(String[] args) {
        Integer[] nums = {8, 4, 5, 7, 1, 3, 6, 2};
        Integer[] tmp = new Integer[nums.length];
        MergeSort.mergeSort(nums, 0, nums.length-1, tmp);

        System.out.println(Arrays.toString(nums));
    }
}
