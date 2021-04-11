package com.ml.algorithm.companyh.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * @author miaoliang
 * @since 4/1/21 8:46 PM
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) !=null) {
            char[] chars = line.toCharArray();
            LinkedList num = new LinkedList<Integer>();
            LinkedList strList = new LinkedList<String>();
            strList.addLast("");
            StringBuilder sb = new StringBuilder();
            boolean isNum = false;
            boolean start = false;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 48 && chars[i] <=57){
                    if (isNum) {
                        char[] str = {chars[i]};
                        int i1 = ((int)num.pop()) * 10 + Integer.parseInt(new String(str));
                        num.addFirst(i1);
                    } else {
                        char[] str = {chars[i]};
                        int a = Integer.parseInt(new String(str));
                        num.addFirst(a);
                    }
                    isNum = true;
                } else {
                    isNum = false;
                    if (chars[i] == '['){
                        start = true;
                        continue;
                    }
                    if (chars[i] == ']') {
                        start = false;
                    }
                    if (start) {
                        String s = (String) strList.getLast() + chars[i];
                        strList.addLast(s);
                    }
                }
            }
            for (int i = 0; i < (int)num.getFirst(); i++) {
                sb.append(strList.getLast());
            }
            System.out.println(sb.toString());
        }
    }
}
