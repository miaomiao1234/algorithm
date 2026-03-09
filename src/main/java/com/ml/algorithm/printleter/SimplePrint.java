package com.ml.algorithm.printleter;

/**
 * @author miaoliang
 * @since 2026/3/7 20:01
 * 大小写轮训打印26个英文字母
 */
public class SimplePrint {

    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('a' + i));
            System.out.print((char) ('A' + i));
        }
    }

}
