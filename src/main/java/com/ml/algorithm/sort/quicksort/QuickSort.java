package com.ml.algorithm.sort.quicksort;


import com.ml.algorithm.sort.Sort;

import java.util.Random;

/**
 * @author miaoliang
 * @since 3/20/21 10:24 PM
 *
 * 快速排序
 *  思想：
 *      （1）取出数组中的一个元素作为初始比较值，将小于等于该值的元素放到数组左边，大于该值的元素放到数组右边，得到两个子数组，
 *      （2）采用同样的方法对得到的子数组进行（1）操作，直至子数组元素小于等于1
 *      （3）最后得到的数组就是排好序的数组
 *
 *  复杂度分析：
 *      （1）理想状态下，每次都能取出数组中，大小为中位数的元素，将数组分为大小相等的两个子数组，深度为lg n;
 *      （2）每次遍历数组元素总和为n
 *      （3）最终复杂度为 nlg n;
 *      （4）最坏的情况就是每次都拿到数组中的最大或者最小值，那么复杂度接近 插入排序的 n^2
 *
 *  快排采用分制思想，数据量越大，相比插入排序效果越好
 *  为了尽可能的避免最坏情况的发生，可以采用随机算法规避
 *
 */
public class QuickSort extends Sort {

    private Random random = new Random();

    @Override
    public void sort(int[] array) {
        //初始化数组
        // 排序
        partition(array,0,array.length-1);

    }

    private void partition(int[] array, int start, int end) {
        if (end-start < 1) return;
        // 选取切割数组的元素
//        int x = array[end];
        // 采用随机算法，避免出现最糟糕情况
        int x = array[start + random.nextInt(end-start)];
        // 定义 切割元素右侧子数组开始位置
        int rightStart = start - 1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= x) {
                rightStart++;
                swapElement(array,i,rightStart);
            }
        }
        partition(array,start,rightStart-1);
        partition(array,rightStart+1,end);

    }


}
