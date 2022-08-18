package tree.heapSort;

/**
 * @author: JoeyShelby
 * @date: 2022-08-17 14:59
 */

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {

    /**
     * 使用大顶堆进行升序排序
     * @param array
     * @return
     */
    public static int[] ascendingHeapSort(int[] array) {
        int length = array.length;

        for(int i = length; i > 0 ; i--) {
            /*将数组指定长度范围内的元素构造成大顶堆*/
            CreateHeap.bigTopHeap(array, i);
            // 堆顶不断向后置换
            int tmp = array[0];
            array[0] = array[i - 1];
            array[i - 1] = tmp;
        }

        return array;
    }

    /**
     * 使用小顶堆进行降序排序
     * @param array
     * @return
     */
    public static int[] DescendingHeapSort(int[] array) {
        int length = array.length;

        for(int i = length; i > 0 ; i--) {
            /*将数组指定长度范围内的元素构造成大顶堆*/
            CreateHeap.smallTopHeap(array, i);
            // 堆顶不断向后置换
            int tmp = array[0];
            array[0] = array[i - 1];
            array[i - 1] = tmp;
        }

        return array;
    }
}
