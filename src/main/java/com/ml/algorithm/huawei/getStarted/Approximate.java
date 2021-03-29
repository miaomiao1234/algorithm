package com.ml.algorithm.huawei.getStarted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author miaoliang
 * @since 3/28/21 11:31 AM
 *
 * 题目描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 *
 * 输入描述:
 * 输入一个正浮点数值
 *
 * 输出描述:
 * 输出该数值的近似整数值
 */
public class Approximate {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int index = s.indexOf(".");
        int a = Integer.parseInt(s.substring(0, index));
        int b = Integer.parseInt(s.substring(index + 1, index + 2));
        if (b > 4){
            a++;
        }
        System.out.println(a);
    }
}
