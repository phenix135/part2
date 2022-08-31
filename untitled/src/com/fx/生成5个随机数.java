package com.fx;

import java.util.Random;
import java.util.Scanner;

//生成5个随机数
public class 生成5个随机数 {
    public static void main(String[] args) {
        //1.先创建有5个元素的数组
        int [] data =new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("请输入第"+i+"个数");
            data[i] = sc.nextInt();
        }
        //2.将数组的索引与随机数换位
        Random r =new Random();
        for(int i=0;i<5;i++){
            int index = r.nextInt(5);
            int temp = data[i];
            data[i] =data[index];
            data[index] =temp;
        }
        System.out.println("输出这个随机数组：");
        for(int i=0;i<5;i++){
            System.out.println(data[i]);
        }
    }
}
