package com.ml.algorithm.companyh.simple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author miaoliang
 * @since 3/30/21 10:09 PM
 *
 *
 * 题目描述
 * 题目描述
 *
 * 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1 是同一种分法。
 *
 * 数据范围：0<=m<=10，1<=n<=10。
 * 本题含有多组样例输入。
 *
 *
 * 输入描述:
 * 输入两个int整数
 *
 * 输出描述:
 * 输出结果，int型
 *
 * 示例1
 * 输入
 * 7 3
 *
 * 输出
 * 8
 *
 * 分析：
 *  f(m,n) 为 m 个苹果，n 个盘子总共的摆放数量
 *  （1）如果 n > m，必定有 m-n 个盘子空着，根据题意，盘子没有顺序，所以空着的盘子去掉不会对最后的结果产生影响，f(m,n) = f(m,m)；
 *  （2）如果每次只空出一个盘子，其他的盘子里必定有苹果，f(m,n) = f(m,n-1)；
 *      而每个盘子里面都有苹果那么每个盘子里面拿掉一个苹果对最后的结果又不受影响，f(m,n) = f(m-n,n)；
 *      因而摆放的结果为 f(m,n) = f(m,n-1) + f(m-n,n)；
 *  （3）当盘子只剩一个时，只有一种方法 n == 1 时，return 1；
 *      当苹果只剩一个时，只有一种方法 m == 1 时，return 1；
 *      当 m <= n 时，只有一种方法， return 1；
 */
public class DistributeApple {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] s = line.split(" ");
            int m = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            System.out.println(distributeApple(m, n));
        }
    }

    private static int distributeApple(int m, int n) {
        if (m == 0 || n == 1) {
            return 1;
        } else if (m < n) {
            return distributeApple(m,m);
        } else {
            return distributeApple(m, n-1) + distributeApple(m-n,n);
        }
    }

}
