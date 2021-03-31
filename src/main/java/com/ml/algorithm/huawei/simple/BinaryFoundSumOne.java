package com.ml.algorithm.huawei.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author miaoliang
 * @since 3/31/21 7:57 PM
 *
 *
 * 题目描述
 *
 * 输入一个正整数，计算它在二进制下的1的个数。
 * 注意多组输入输出！！！！！！
 * 输入描述:
 * 输入一个整数
 *
 * 输出描述:
 * 计算整数二进制中1的个数
 *
 * 示例1
 * 输入
 * 5
 * 输出
 * 2
 */
public class BinaryFoundSumOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null){
            char[] chars = Integer.toBinaryString(Integer.parseInt(line)).toCharArray();
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if ('1' == chars[i]) count++;
            }
            System.out.println(count);
        }
    }
}
