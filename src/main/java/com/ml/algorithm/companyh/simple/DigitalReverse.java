package com.ml.algorithm.companyh.simple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author miaoliang
 * @since 3/28/21 12:16 PM
 *
 * 题目描述
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 *
 * 输入描述:
 * 输入一个int整数
 *
 * 输出描述:
 * 将这个整数以字符串的形式逆序输出
 */
public class DigitalReverse {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();
        char[] revertChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            revertChars[i] = chars[chars.length-1-i];
        }
        System.out.println(new String(revertChars));
    }

}
