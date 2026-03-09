package com.ml.algorithm.sort.quicksort;

import com.ml.algorithm.sort.Sort;

/**
 * @author miaoliang
 * @since 2026/3/9 13:35
 */
public class QuickSort2 extends Sort {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    public void quickSort(int[] array, int left, int right) {
        if (left  >= right) return;  // 终止递归
        int pivot = partition(array, left, right);  // 分区
        quickSort(array, left, pivot - 1);   // 递归左边
        quickSort(array, pivot + 1, right);   // 递归右边
    }

    public int partition(int[] array, int left, int right) {
        // 选取 pivot
        int pindex = left + (int)(Math. random() * (right - left + 1));
        int pivot = array[pindex];
        swapElement(array, pindex, right);
//        int pivot = array[right];
        // 开始下标
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                swapElement(array, i, j);
            }
        }
        // 将pivot下标换到中间来
        swapElement(array, i+1, right);
        return i+1;
    }


}
