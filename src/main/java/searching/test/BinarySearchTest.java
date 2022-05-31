package searching.test;

import searching.BinarySearch;
import searching.LinearSearch;

/**
 * @author: JoeyShelby
 * @date: 2022-05-04 14:50
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int left = 0;
        int right = nums.length - 1;

      //  System.out.println("index:" + BinarySearch.binarySearch(nums, target, left, right));

        System.out.println("index:" + BinarySearch.binarySearch2(nums, target));
    }


}
