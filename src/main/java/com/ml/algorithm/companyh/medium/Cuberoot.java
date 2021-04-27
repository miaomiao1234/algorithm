package com.ml.algorithm.companyh.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * @author miaoliang
 * @since 4/26/21 11:17 PM
 *
 * 题目描述
 * 计算一个数字的立方根，不使用库函数。
 * 保留一位小数。
 *
 *
 * 输入描述:
 * 待求解参数，为double类型（一个实数）
 *
 * 输出描述:
 * 输入参数的立方根。保留一位小数。
 */
public class Cuberoot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            double v = Double.parseDouble(line);
            methodPow(v);
            dichotomy(v);
        }

    }

    private static void dichotomy(double v) {
        double min = 0;
        double max = v;
        double middle = 0;
        boolean isNegative = false;
        if (v < 0) {
            v = -v;
            max = v;
            isNegative = true;
        }
        if (v < 1 && v > 0){
            max = 1;
        }
        if (v > -1 && v < 0) {
            v = -v;
            max = v;
        }
        while (max - min > 0.0001){
            middle = (max + min) /2;
            if (middle * middle * middle > v) {
                max = middle;
            } else if (middle * middle * middle < v) {
                min = middle;
            } else {
                break;
            }
        }
         if (isNegative) {
             System.out.printf("%.1f\n",-middle);
         } else {
             System.out.printf("%.1f\n",middle);
         }
    }

    private static void methodPow(double v) {
        String pow = new DecimalFormat("0.0").format(Math.pow(v, 1.0/3.0));
        System.out.println(pow);
    }
}
