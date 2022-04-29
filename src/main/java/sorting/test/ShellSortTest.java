package sorting.test;

import sorting.shellSorting.ShellSort;

import java.util.Arrays;

/**
 * @author: JoeyShelby
 * @date: 2022-04-29 17:41
 */
public class ShellSortTest {
    public static void main(String[] args) {
        Integer[] nums = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        System.out.println(Arrays.toString(ShellSort.sort(nums)));
    }
}
