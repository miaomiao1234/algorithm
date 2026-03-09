package com.ml.algorithm.printleter;

import java.util.concurrent.Semaphore;

/**
 * @author miaoliang
 * @since 2026/3/7 20:10
 * 大小写轮训打印26个英文字母
 */
public class PrintLettersSemaphore {

    public static void main(String[] args) throws InterruptedException {

        // 定义信号
        Semaphore loweSem = new Semaphore(1);
        Semaphore upperSem = new Semaphore(0);

        // 小写字母打印线程
        Thread loweThread = new Thread(() -> {
            // 获取锁
            for (int i = 0; i < 26; i++) {
                try {
                    loweSem.acquire();
                    System.out.print((char) ('a'+i));
                    upperSem.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // 大写字母线程
        Thread upperThread = new Thread(() -> {
            for (int i = 0; i < 26; i++) {
                try {
                    upperSem.acquire();
                    System.out.print((char) ('A'+ i));
                    loweSem.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        loweThread.start();
        upperThread.start();
    }

}
