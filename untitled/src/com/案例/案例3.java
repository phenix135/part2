package com.案例;   //生成5位的验证码，由数字，大，小写字母组成

import java.util.Random;
import java.util.Scanner;

public class 案例3 {
    public static void main(String[] args) {
        int n;
        String k ;
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
       k = createcode(n);
        System.out.println(k);

    }
    public static String createcode(int n){
        String code = " ";
        Random r = new Random();

        for(int i =0;i<n;i++){
            int type =r.nextInt(3); // 0对应大写字母，1对应小写字母
            switch(type){
                case 0:    //A:65 Z:65+25
                    char ch =(char)(r.nextInt(26)+65);
                    code += ch;
                    break;
                case 1:    // a:97 z:97+25
                    char sh =(char)(r.nextInt(26)+97);
                    code += sh;
                    break;
                case 2:   //   数字字母
                    code += r.nextInt(10); //从0到9  ,将数字视作字符，即使连续两个数字也不进行算数运算
                    break;
            }
        }
        return code;
    }
}
