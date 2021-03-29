package com.ml.algorithm.huawei.simple;

import java.io.InputStream;
import java.io.IOException;

/**
 * @author miaoliang
 * @since 3/28/21 4:18 PM
 *
 * 题目描述
 * 输入一个表达式（用字符串表示），求这个表达式的值。
 * 保证字符串中的有效字符包括[‘0’-‘9’],‘+’,‘-’, ‘*’,‘/’ ,‘(’， ‘)’,‘[’, ‘]’,‘{’ ,‘}’。且表达式一定合法。
 *
 *
 *
 * 输入描述:
 * 输入一个算术表达式
 *
 * 输出描述:
 * 得到计算结果
 *
 * 示例1
 * 输入
 * 3+2*{1+2*[-4/(8-6)+7]}
 * 输出
 * 25
 */
public class Arithmetic {


    public static void main(String[] args) throws IOException{
        InputStream is = System.in;
        int result = new Expr().expr(is);
        System.out.println(result);
    }

    public static class Expr {
        public char lastChar = 0;
        public char nextChar = 0;
        public int firstTemp = 0;
        public int secondTemp = 0;
        private static final char TEMPCHAR = 0;
        private int expr(InputStream in) throws IOException{
            int result = 0;
            char c;
            a: while ((c = (char)in.read()) != '\n'){
                switch (c) {
                    case ')': case ']': case '}':
                        break a; case '(': case '[': case '{': secondTemp = new Expr().expr(in);
                        break; case '+': case '-': firstMath(TEMPCHAR);
                        result = secondMath(c, result);
                        break; case '*': case '/': firstMath(c);
                        break; default: secondTemp = secondTemp * 10 + c - '0';
                        break;
                }
            }
            firstMath(TEMPCHAR);
            result = secondMath(TEMPCHAR, result);
            return result;
        }
        private void firstMath(char c){
            switch (nextChar) {
                case 0:
                    firstTemp = secondTemp;
                    break; case '*': firstTemp *= secondTemp;
                    break; case '/': firstTemp /= secondTemp;
                    break; default: break;
            }
            secondTemp = 0;
            nextChar = c;
        }
        private int secondMath(char c, int result){
            switch (lastChar) {
                case 0:
                    result = firstTemp;
                    break; case '-': result -= firstTemp;
                    break; case '+': result += firstTemp;
                    break; default: break;
            }
            firstTemp = 0;
            lastChar = c;
            return result;
        }
    }
}
