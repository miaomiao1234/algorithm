package com.ml.algorithm.bracketsolution;

import java.util.Stack;

/**
 * @author miaoliang
 * @since 2026/3/10 17:30
 * 给定一个只包括 `'('`，`')'`，`'{'`，`'}'`，`'['`，`']'` 的字符串 `s` ，判断字符串是否有效。
 * 有效字符串需满足：
 * 1. 左括号必须用相同类型的右括号闭合。
 * 2. 左括号必须以正确的顺序闭合。
 * 3. 每个右括号都有一个对应的相同类型的左括号。
 * 示例 1：
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * 输入：s = "()[]{}"
 */
public class BracketsSolution {

    public static boolean isValiad() {
        String s = "()[]{}";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // 左括号入栈
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // 没有匹配的左括号
                if (stack.isEmpty()) return false;
                // 弹栈
                Character pop = stack.pop();
                if (c == ')' && pop != '(')  return false;
                if (c == ']' && pop != '[')  return false;
                if (c == '}' && pop != '{')  return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValiad());
    }
}

