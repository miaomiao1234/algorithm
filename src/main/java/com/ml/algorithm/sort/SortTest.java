package com.ml.algorithm.sort;

import com.ml.algorithm.sort.insertionsort.InsertionSort;
import com.ml.algorithm.sort.quicksort.QuickSort;
import com.ml.algorithm.sort.quicksort.QuickSort2;

import java.util.Random;

/**
 * @author miaoliang
 * @since 3/20/21 11:27 PM
 */
public class SortTest {

    public static void main(String[] args) {
        Sort insertionSort = new InsertionSort();
        Sort quickSort = new QuickSort();
        Sort quickSort2 = new QuickSort2();
        //初始化数组
        Random random = new Random();
        int a = 10000;
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(a);
        }
//        insertionSort.sort(array);
//        System.out.println();
        quickSort.sort(array);
        quickSort.print(array);
        System.out.println();
//        quickSort2.sort(array);
//        quickSort2.print(array);


    }

}
