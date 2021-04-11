package com.ml.algorithm.companyh.getStarted;

import java.util.Scanner;

/**
 * @author miaoliang
 * @since 3/28/21 11:53 AM
 *
 * 题目描述
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 *
 * 输入描述:
 *  输入一个整数（int类型）
 *
 * 输出描述:
 *  这个数转换成2进制后，输出1的个数
 */
public class BitOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String string = Integer.toBinaryString(a);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if ('1' == string.charAt(i)) count++;
        }
        System.out.println(count);
    }

}
