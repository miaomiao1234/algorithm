package com.ml.algorithm.companyh.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author miaoliang
 * @since 3/31/21 8:19 PM
 *
 *题目描述
 * 有6条配置命令，它们执行的结果分别是：
 *
 * 命   令	执   行
 * reset	reset what
 * reset board	board fault
 * board add	where to add
 * board delete	no board at all
 * reboot backplane	impossible
 * backplane abort	install first
 * he he	unknown command
 * 注意：he he不是命令。
 *
 * 为了简化输入，方便用户，以“最短唯一匹配原则”匹配：
 * 1、若只输入一字串，则只匹配一个关键字的命令行。例如输入：r，根据该规则，匹配命令reset，执行结果为：reset what；输入：res，根据该规则，匹配命令reset，执行结果为：reset what；
 * 2、若只输入一字串，但本条命令有两个关键字，则匹配失败。例如输入：reb，可以找到命令reboot backpalne，但是该命令有两个关键词，所有匹配失败，执行结果为：unknown command
 * 3、若输入两字串，则先匹配第一关键字，如果有匹配但不唯一，继续匹配第二关键字，如果仍不唯一，匹配失败。例如输入：r b，找到匹配命令reset board 和 reboot backplane，执行结果为：unknown command。
 *
 * 4、若输入两字串，则先匹配第一关键字，如果有匹配但不唯一，继续匹配第二关键字，如果唯一，匹配成功。例如输入：b a，无法确定是命令board add还是backplane abort，匹配失败。
 * 5、若输入两字串，第一关键字匹配成功，则匹配第二关键字，若无匹配，失败。例如输入：bo a，确定是命令board add，匹配成功。
 * 6、若匹配失败，打印“unknown command”
 *
 *
 * 输入描述:
 * 多行字符串，每行字符串一条命令
 *
 * 输出描述:
 * 执行结果，每条命令输出一行
 * 示例1
 * 输入
 * 复制
 * reset
 * reset board
 * board add
 * board delet
 * reboot backplane
 * backplane abort
 *
 * 输出
 * 复制
 * reset what
 * board fault
 * where to add
 * no board at all
 * impossible
 * install first
 */
public class MatchString {
    public static void main(String[] args) throws IOException {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Set<String> set = new HashSet<>();
        set.add("reset board");
        set.add("board add");
        set.add("board delete");
        set.add("reboot backplane");
        set.add("backplane abort");
        map1.put("reset","reset what");
        map2.put("reset board","board fault");
        map2.put("board add","where to add");
        map2.put("board delete","no board at all");
        map2.put("reboot backplane","impossible");
        map2.put("backplane abort","install first");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            if ("".equals(line)) continue;
            String[] strings = line.split(" ");
            int count = 0;
            // 输入一字串
            if (strings.length == 1) {
                if ("reset".contains(line)) {
                    System.out.println(map1.get("reset"));
                }
            } else if (strings.length == 2) {
                String key = "";
                Iterator<String> iterator = set.iterator();
                while (iterator.hasNext()) {
                    String next = iterator.next();
                    String[] s = next.split(" ");
                    if (s[0].contains(strings[0])) {
                        if (s[1].contains(strings[1])) {
                            key = next;
                            count++;
                        }
                    }
                }
                if (count == 1) {
                    System.out.println(map2.get(key));
                } else {
                    System.out.println("unknown command");
                }
            } else {
                System.out.println("unknown command");
            }
        }

    }
}
