package sorting.test;

import sorting.radixSorting.RadixSort;

import java.util.Arrays;

/**
 * @author: JoeyShelby
 * @date: 2022-05-03 16:46
 */
public class RadixSortTest {
    public static void main(String[] args) {
        Integer[] nums = {53, 3, 542, 748, 14, 214};
        RadixSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
