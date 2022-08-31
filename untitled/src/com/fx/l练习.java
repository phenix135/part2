package com.fx;

import java.util.Random;
import java.util.Scanner;

public class l练习 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("你的年龄为：" + age);
        System.out.println("-------------------");

        Random r = new Random();
        int number = r.nextInt(10);
        System.out.println(number);
    }
}
