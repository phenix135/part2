package com.案例;

import java.util.Scanner;

//评委打分，有6个评委，去掉最高分和最低分，计算平均分
public class 案例5 {
    public static void main(String[] args) {
    int [] arr=  new int [6];
    //1.输入六个评委的分数
        Scanner sc =new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个评委的分数");
            int score = sc.nextInt();
            arr[i]=score;
        }
    //2.计算出最高分，最低分，和平均分
        int max=arr[0],min=arr[0],sum=0;
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            sum +=arr[i];
        }
       double aver=(sum-min-max)/(arr.length-2);
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
        System.out.println("平均数为"+aver);//输出平均数
    }
}
