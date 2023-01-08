package com.itheima.type;

public class Demo3 {
    public static void main(String[] args) {
        // 强制类型转换并使用
        int a = 20;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);

        double score = 99.5;
        int it = (int) score;
        System.out.println(it);
    }
}
