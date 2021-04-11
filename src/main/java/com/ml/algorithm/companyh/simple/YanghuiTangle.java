package com.ml.algorithm.companyh.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author miaoliang
 * @since 3/29/21 6:35 PM
 *
 * 题目描述
 * 1
 *
 * 1  1  1
 *
 * 1  2  3  2  1
 *
 * 1  3  6  7  6  3  1
 *
 * 1  4  10 16 19  16 10  4  1
 *
 * 以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数，左上角数到右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
 *
 * 求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3。
 *
 *
 * 输入n(n <= 1000000000)
 * 本题有多组输入数据，输入到文件末尾，请使用while(cin>>)等方式读入
 * 输入描述:
 * 输入一个int整数
 *
 * 输出描述:
 * 输出返回的int值
 *
 * 示例1
 * 输入
 * 复制
 * 4
 * 2
 * 输出
 * 复制
 * 3
 * -1
 *
 * 分析：
 *  （1）第一反应是根据描述找到对应的计算机语言模型，发现好难，然后看评论原来多写几行就可以发现规律，感觉像是初中数学题
 *  （2）n	     1	2	3	4	5	6	7	8	9	10	11	……
 *      index	-1	-1	2	3	2	4	2	3	2	4	2	……    （第一个偶数的位置）
 *  （3）可以看出4组一轮回
 *
 */
public class YanghuiTangle {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            int i = Integer.parseInt(line);
            if (i < 3){
                System.out.println(-1);
            } else {
                if (i%4 == 1 || i%4 == 3) {
                    System.out.println(2);
                } else if (i%4 == 2) {
                    System.out.println(4);
                } else {
                    System.out.println(3);
                }
            }
        }
    }

}
