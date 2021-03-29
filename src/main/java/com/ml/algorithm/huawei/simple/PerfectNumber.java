package com.ml.algorithm.huawei.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author miaoliang
 * @since 3/29/21 9:33 PM
 *
 * 题目描述
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 *
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 *
 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。s
 *
 * 输入n，请输出n以内(含n)完全数的个数。计算范围, 0 < n <= 500000
 *
 *
 * 本题输入含有多组样例。
 *
 * 输入描述:
 * 输入一个数字n
 *
 * 输出描述:
 * 输出不超过n的完全数的个数
 *
 * 示例1
 * 输入
 * 1000
 * 7
 * 100
 * 输出
 * 3
 * 1
 * 2
 */
public class PerfectNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null){
            int n = Integer.parseInt(line);
            int count = 0;
            for (int i = 1; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= i/2; j++) {
                    if (i % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) count++;
            }
            System.out.println(count);
        }
    }

}
