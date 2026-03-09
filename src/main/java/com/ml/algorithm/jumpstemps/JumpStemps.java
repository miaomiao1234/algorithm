package com.ml.algorithm.jumpstemps;

/**
 * @author miaoliang
 * @since 2026/3/9 13:07
 * 跳台阶，一次跳一阶或二阶，共有多少种眺法
 */
public class JumpStemps {

    // 动态规划版
    public static int climbStairs(int n){
        if (n <= 2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static int climbStairsDP(int n){
        if (n <= 2) return n;
        int pre1 = 2;  //f（n-1）
        int pre2 = 1;  //f(n-2)
        for (int i = 3; i <= n; i++) {
            int curr = pre1 + pre2;
            pre2 = pre1;
            pre1 = curr;
        }
        return pre1;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairsDP(5));
    }

}
