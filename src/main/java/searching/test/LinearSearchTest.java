package searching.test;

import searching.LinearSearch;

/**
 * @author: JoeyShelby
 * @date: 2022-05-04 14:40
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        Integer[] nums = {1,9,11,-1,34,89};
        int target = 34;
        System.out.println("index: "+LinearSearch.linearSearch(nums, 34));
    }
}
