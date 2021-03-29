package com.ml.algorithm.huawei.simple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author miaoliang
 * @since 3/28/21 2:28 PM
 *
 * 题目描述
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 * 输入描述:
 * 输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。n=0表示输入结束，你的程序不应当处理这一行。
 *
 * 输出描述:
 * 对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
 *
 * 分析：
 *  1.正常结题用递归
 *  2.因为可以提前跟老板借水，相当于2个空瓶就可以换一瓶水
 */
public class WaterBottle {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int a = -1;
//        while (a != 0) {
//            a = scanner.nextInt();
//            if (a != 0) System.out.println(countWater1(a));
//        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = reader.readLine()) != null) {
            if (Integer.parseInt(str) == 0) break;
            System.out.println(countWater1(Integer.parseInt(str)));
        }
    }

    private static int countWater1(int a) {
        return a/2;
    }

    private static int countWater(int a) {
        if (a == 1) return 0;
        if (a == 2) return 1;
        if (a >= 3) {
            return a/3 + countWater(a/3 + a%3);
        }
        return 0;
    }

}
