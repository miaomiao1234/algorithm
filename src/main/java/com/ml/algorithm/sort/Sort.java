package com.ml.algorithm.sort;

/**
 * @author miaoliang
 * @since 3/20/21 11:28 PM
 */
public abstract class Sort {

    public abstract void sort(int[] array);

    public void swapElement(int[] array, int a, int b){
        int temp;
        temp = array[a];
        array[a]= array[b];
        array[b] = temp;
    }

    public void print(int[] array){
        for (int i : array) {
            System.out.print(i+",");
        }
    }

}
