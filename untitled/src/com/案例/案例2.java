package com.案例;   //判断素数

public class 案例2 {
    public static void main(String[] args) {
        for(int i=100;i<=200;i++){
            boolean flag =true; //为素数
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    flag = false;
                }
            }
            if(flag==true){
                System.out.println(i);
            }
        }
    }
}
