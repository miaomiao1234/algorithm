package com.ml.algorithm.printnumber;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author miaoliang
 * @since 2026/3/9 10:14
 * 不用锁多线程打印1到100数字
 */
public class PrintNum {

    // 定义 automic 变量
    private static final AtomicInteger num = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            int val;
            while ((val = num.getAndIncrement()) <= 100) {
                System.out.println(Thread.currentThread().getName() + ":" + val);
            }
        };
        Thread thread1 = new Thread(task,"线程1");
        Thread thread2 = new Thread(task,"线程2");
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();

    }

}
