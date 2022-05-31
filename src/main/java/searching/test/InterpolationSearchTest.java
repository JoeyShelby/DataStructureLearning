package searching.test;

import searching.InterpolationSearch;

/**
 * @author: JoeyShelby
 * @date: 2022-05-04 15:24
 */
public class InterpolationSearchTest {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int left = 0;
        int right = nums.length - 1;

        System.out.println("index:" + InterpolationSearch.interpolationSearch(nums, target, left, right));
    }
}
