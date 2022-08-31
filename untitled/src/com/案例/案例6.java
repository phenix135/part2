package com.案例;

//数据加密，先加5，在除10取余，再反转

import java.util.Scanner;

public class 案例6 {
    public static void main(String[] args) {
        //1.先定义一个数组
        int [] data= new int[4];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i< data.length;i++){
            System.out.println("请输入第"+(i+1)+"个数据");
            data[i]= sc.nextInt();
        }
        //2.输出当前数组的数据
        printarry(data);

        //3.对数据进行加密
         for(int i=0;i< data.length;i++){
             data[i]=(data[i]+5)%10;
         }
         //4.将得到的数据进行反转
        for(int i=0,j= data.length-1;i<j;i++,j--){
            int temp =data[i];
            data[i]=data[j];
           data[j]=temp;
        }
        System.out.println("加密后的数据为：");
        printarry(data);
    }
    public static void printarry(int arr[]){
        System.out.print("[");
        for(int i=0;i< arr.length;i++){
            System.out.print(i== arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }
}
