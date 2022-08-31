package com.案例;   //计算机票的价格

import java.util.Scanner;

public class 案例1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");    //输入月份
        int month = sc.nextInt();

        System.out.println("请输入季节：");  //输入季节
        String jijie = sc.next();

        System.out.println("请输入价格：");
        int piece = sc.nextInt();
        int c = calc(month,jijie,piece);
        System.out.println("机票的价格为" + c);
    }
    public static int calc(int month,String jijie,int piece){
        if(month>=5&&month<=10) {
            switch (jijie) {
                case "旺季":
                    piece *= 0.9;
                    break;
                case "淡季":
                    piece *= 0.75;
                    break;
                default:
                    System.out.println("您的输入有误！");
                    return -1;
            }
        }
        else if(month==11||month==12||month>=1&&month<=4){
            switch(jijie){
                case"旺季":
                    piece *= 0.85;
                    break;
                case"淡季":
                    piece *= 0.65;
                    break;
                default:
                    System.out.println("您的输入有误！");
                    return -1;
            }
        }return piece;
    }
}

