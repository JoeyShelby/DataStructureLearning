package tree.heapSort;

/**
 * @author: JoeyShelby
 * @date: 2022-08-17 14:27
 */

/**
 * 传入完全二叉树，构造大顶堆或小顶堆
 */
public class CreateHeap {
    /**
     * 构造大顶堆
     * @param array
     * @param length 需要调整的数组的元素长度
     * @return
     */
     public static int[] bigTopHeap(int[] array, int length) {
        if (array.length < 2) return array;

        // 找到第一个非叶子节点
        int start = length / 2 - 1;
        // 若不再发生调整，则为堆结构，则退出循环
        boolean isHeap = false;

        while (!isHeap) {
            isHeap = true;
            for (int i = start; i >= 0 ; i--) {
                if (i * 2 + 1 < length && array[i * 2 + 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i * 2 + 1];
                    array[i * 2 + 1] = tmp;
                    isHeap = false;
                }
                if (i * 2 + 2 < length && array[i * 2 + 2] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i * 2 + 2];
                    array[i * 2 + 2] = tmp;
                    isHeap = false;
                }
            }
        }

        return array;
    }

    /**
     * 构造小顶堆
     * @param array
     * @return
     */
    static public int[] smallTopHeap(int[] array, int length) {
        if (array.length < 2) return array;

        // 找到第一个非叶子节点
        int start = length / 2 - 1;
        // 若不再发生调整，则为堆结构，则退出循环
        boolean isHeap = false;

        while (!isHeap) {
            isHeap = true;
            for (int i = start; i >= 0 ; i--) {
                if (i * 2 + 1 < length && array[i * 2 + 1] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[i * 2 + 1];
                    array[i * 2 + 1] = tmp;
                    isHeap = false;
                }
                if (i * 2 + 2 < length && array[i * 2 + 2] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[i * 2 + 2];
                    array[i * 2 + 2] = tmp;
                    isHeap = false;
                }
            }
        }

        return array;
    }

}
