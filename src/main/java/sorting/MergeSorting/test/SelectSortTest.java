package sorting.MergeSorting.test;

import sorting.selectSorting.SelectSort;

import java.util.Arrays;

/**
 * @author: JoeyShelby
 * @date: 2022-04-29 16:12
 */
public class SelectSortTest {
    public static void main(String[] args) {
        Integer[] nums = {101, 34, 119, 1};
        System.out.println(Arrays.toString(SelectSort.selectSort(nums)));
    }
}
