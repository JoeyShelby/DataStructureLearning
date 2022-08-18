package tree.heapSort;

import java.util.Arrays;

/**
 * @author: JoeyShelby
 * @date: 2022-08-17 14:42
 */
public class HeapTest {
    public static void main(String[] args) {
        int[] array = {4, 6, 8, 5, 9, 11};

        System.out.println(Arrays.toString(HeapSort.ascendingHeapSort(array)));
        System.out.println(Arrays.toString(HeapSort.DescendingHeapSort(array)));
    }
}
