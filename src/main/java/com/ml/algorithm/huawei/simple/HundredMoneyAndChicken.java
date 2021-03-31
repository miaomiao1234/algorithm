package com.ml.algorithm.huawei.simple;

/**
 * @author miaoliang
 * @since 3/31/21 8:57 PM
 *
 * 题目描述
 * 公元前五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 *
 * 详细描述：
 *
 * 接口说明
 *
 * 原型：
 *
 * int GetResult(vector &list)
 *
 * 输入参数：
 *
 *         无
 *
 * 输出参数（指针指向的内存区域保证有效）：
 *
 *     list  鸡翁、鸡母、鸡雏组合的列表
 *
 * 返回值：
 *
 *      -1 失败
 *
 *      0 成功
 *
 *
 *
 *
 *
 * 输入描述:
 * 输入任何一个整数，即可运行程序。
 *
 * 输出描述:
 *
 *
 * 示例1
 * 输入
 * 1
 * 输出
 * 0 25 75
 * 4 18 78
 * 8 11 81
 * 12 4 84
 *
 * 分析：
 *  （1）正常需要三层循环
 *  （2）判断 5x+3y+z/3=100 && x+y+z=100
 *  （3）得出最后值
 *  或者手动排除一个未知数，得出7x+4y=100 切 0 <= x,y,z <= 100
 */
public class HundredMoneyAndChicken {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            if ((100-7*i) % 4 == 0){
                System.out.print(i);
                System.out.print(" ");
                System.out.print((100-7*i)/4);
                System.out.print(" ");
                System.out.print(100-i-(100-7*i)/4);
                System.out.println();
            }
        }
    }
}
