package com.itheima.type;

public class Demo2 {
    public static void main(String[] args) {
        // 表达式的自动类型转换
        byte a = 10;
        int b = 20;
        double c = 1.0;
        double rs = a + b + c;
        System.out.println(rs);

        double rs2 = a + b - 2.3;
        System.out.println(rs2);

        // 面试题
        byte i = 10;
        byte j = 20;
        // byte, short, char 是直接转换成int类型来计算的
        int k = i + j;
        System.out.println(k);
    }
}
