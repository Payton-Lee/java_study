package com.itheima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        double weight1 = sc.nextDouble();
        System.out.println("请输入第二只老虎的体重");
        double weight2 = sc.nextDouble();

        System.out.println(weight1 == weight2 ? "相同" : "不同");
    }
}
