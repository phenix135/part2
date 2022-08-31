package com.fx;

public class 冒泡排序 {
    public static void main(String[] args) {
        int age[] ={1,9,0,3,7,2};
        for(int i=0;i< age.length-1;i++) {
            for (int j = 0; j < age.length - 1 - i; j++) {
                if (age[j] > age[j+1]) {
                    int temp = age[j];
                    age[j] = age[j+1];
                    age[j+1] = temp;
                }
            }
        }
        System.out.println("输出交换后数组的值：");
        for(int i=0;i<6;i++)
            System.out.println(age[i]);
    }
}
