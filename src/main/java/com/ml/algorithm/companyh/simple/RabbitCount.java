package com.ml.algorithm.companyh.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author miaoliang
 * @since 3/28/21 3:13 PM
 *
 *  题目描述
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *
 * 本题有多组数据。
 *
 * 输入描述:
 * 输入int型表示month
 *
 * 输出描述:
 * 输出兔子总数int型
 *
 * 分析：
 *  需要用到斐波那契数列
 *  第n个月的兔子的数量是前两个月的总和 f(n) = f(n-1) + f(n-2)
 */
public class RabbitCount {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(countRabbit(Integer.parseInt(line)));
        }
    }

    private static int countRabbit(int month) {
        if (month < 3) {
            return 1;
        } else {
            return countRabbit(month-1) + countRabbit(month-2);
        }
    }

}
