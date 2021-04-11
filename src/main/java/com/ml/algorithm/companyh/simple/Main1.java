package com.ml.algorithm.companyh.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author miaoliang
 * @since 4/1/21 8:46 PM
 */
public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) !=null) {
            String[] split = line.split(",");
            int[] array = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                array[i] = Integer.parseInt(split[i]);
            }
            int min = 0;
            for (int i = 0; i < array.length-5; i++) {
                int temp = array[i];
                for (int j = 0; j < 5; j++) {
                    if (array[i+j] > array[i+j+1] ) {
                        temp = array[i+j+1];
                    }
                }
                if (min < temp) {
                    min = temp;
                }
            }
            System.out.println(5*min);
        }
    }
}
