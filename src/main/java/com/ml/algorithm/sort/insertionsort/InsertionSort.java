package com.ml.algorithm.sort.insertionsort;

import com.ml.algorithm.sort.Sort;

/**
 * @author miaoliang
 * @since 3/20/21 7:11 PM
 *
 * 插入排序
 * 由于插入排序和冒泡排序算法复杂度相差不大，这里只记录插入排序
 * jdk arraylist 自带排序为归并排序
 *
 * 思想:
 *  从数组的第二个元素开始，一次同之前的元素进行比较，插入到比自己大的元素之前，遍历完数组之后就是一个有序的数组
 *
 * 正确性分析：
 *  目标是对数组进行排序，数组元素内容不变，元素的位置发生改变
 *  （1）比较替换操作之前，数组为固定长度元素的数组
 *  （2）一次外侧循环操作之后，只是替换其中元素的位置，并且把最小的元素放到数组最前方
 *  （3）多次循环后，把初始比较元素插入到已排好序的子数组（被比较数组左侧部分）值的中间位置
 *  （4）最后可以认为是一个排好序的数组
 *
 * 复杂度分析：
 *  外侧循环为 n（n-1 默认为n）
 *  内侧循环 为 n （数组初始比较元素下标，小于n，同样以最坏情况n标记）
 *  总体复杂度 为 n*n = n^2
 */
public class InsertionSort extends Sort {

    @Override
    public void sort(int[] array) {
        //初始化数组
        // 2. 处理排序
        // 认为操作下标比较容易出问题，可以借助fori循环操作，见method2；
//        method1(array);
        // 利用双重for循环解决
        method2(array);
    }

    private void method2(int[] array) {
        // 同样从第二个元素开始作为比较的元素
        for (int i = 1; i < array.length; i++) {
            // 利用for训话完成下标的前移
            for (int j = i-1; j >= 0; j--) {
                // 如果被比较的元素array[j]比初始元素array[i]大，则将被比较的元素和初始比较值进行替换位置
                // 注意：因为每次比较如果初始比较值小于被比较值，则替换，所以初始比较值一直处在被比较值之后相邻位置，并且初始比较值前的元素位置顺序是排好序的
                if ( array[j] > array[j+1]) swapElement(array,j,j+1);
            }
        }
    }


    private void method1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // 从第二个元素开始作为比较对象
            int key = array[i];
            // 同前一个比较
            int j = i -1;
            // 如果 比参照值大则更换元素位置
            // 这里的 key 也可以用array[j+1]替换，他就是初始比较值
            while(j >= 0 && array[j] > key){
                swapElement(array,j+1,j);
                if (j>0) j--;
            }
        }
    }


}
