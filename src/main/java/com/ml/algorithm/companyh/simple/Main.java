package com.ml.algorithm.companyh.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author miaoliang
 * @since 3/31/21 10:48 PM
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m,n;
        String[] s1 = reader.readLine().split(" ");
        m = Integer.parseInt(s1[0]);
        n = Integer.parseInt(s1[1]);
        String[] s2 = reader.readLine().split(" ");
        int[] array = new int[s2.length];
        for (int i = 0; i < s2.length; i++) {
            array[i] = Integer.parseInt(s2[i]);
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (array[j+1] < array[j]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        if (m>=n) {
            System.out.println(array[array.length-1]);
        } else {
            int sum = 0;
            int a = n/m;
            int b = n%m;
            for (int i = 0; i <= a; i++) {
                sum += array[b-1+m*i];
            }
            System.out.println(sum);
        }
    }
}




































//    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//    String s;
//        while((s=br.readLine())!=null){
////            method1(s);
//                method2(s);





//    private static void method1(String s) {
//        char[] chars=s.toCharArray();
//        StringBuffer ana=new StringBuffer();
//        int flag=0;
//        int count=1;
//        for(int i=0;i<chars.length;i++){
//            if(chars[i]=='\"'){
//                flag++;
//                continue;
//            }
//            if(chars[i]!=' '){
//                ana.append(chars[i]);
//            }
//            if(chars[i]==' '&&flag%2!=0){
//                ana.append(chars[i]);
//            }
//            if(chars[i]==' '&&flag%2==0){
//                ana.append("\n");
//                count++;
//            }
//        }
//        System.out.println(count+"\n"+ana.toString());
//    }
//
//    private static void method2(String s) {
//        String[] s1 = s.split(" ");
//        int a = Integer.parseInt(s1[0]);
//        int b = Integer.parseInt(s1[1]);
//        System.out.println(walk(a,b));
//    }
//
//    private static int walk(int a, int b) {
//        if (a==0 || b==0) {
//            return 1;
//        } else {
//            return walk(a-1,b) + walk(a,b-1);
//        }
//
//    }
//}
