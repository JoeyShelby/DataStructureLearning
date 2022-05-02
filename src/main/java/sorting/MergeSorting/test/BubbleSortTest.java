package sorting.MergeSorting.test;

import sorting.bubbleSorting.BubbleSort;
import sorting.bubbleSorting.BubbleSortBetter;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: JoeyShelby
 * @date: 2022-04-29 15:16
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        Integer[] integers = {5, 4, 2, 1, 3};
        BubbleSort.bubbleSort(integers);
        System.out.println(Arrays.toString(integers));

        BubbleSortBetter.bubbleSort(integers);
        System.out.println(Arrays.toString(integers));
    }
}
