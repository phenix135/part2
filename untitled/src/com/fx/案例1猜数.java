package com.fx;

import java.util.Random;
import java.util.Scanner;

public class 案例1猜数 {
    //猜数游戏
    public static void main(String[] args) {
        //1.定义一个1-100之间的随机幸运数；
        Random  r = new Random();
        int luckNumber = r.nextInt(100) + 1;

    //   2.定义一个死循环不断猜数
        Scanner sc =new Scanner(System.in);
       while(true) {
       int guessNumber = sc.nextInt();
       if(guessNumber > luckNumber){
           System.out.println("你猜大了，请重新输入");
       }else if(guessNumber < luckNumber){
           System.out.println("你猜小了，请重新输入");
       }else{
           System.out.println("恭喜你，猜对了----");
           break;
       }
   }
}
}