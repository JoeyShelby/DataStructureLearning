package sorting.MergeSorting.test;

import sorting.insertSorting.InsertSort;

import java.util.Arrays;

/**
 * @author: JoeyShelby
 * @date: 2022-04-29 16:52
 */
public class InsertSortTest {
    public static void main(String[] args) {
        Integer[] nums = {101, 34, 119, 1};
        System.out.println(Arrays.toString(InsertSort.sort(nums)));
    }
}
