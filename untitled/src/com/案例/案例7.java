package com.案例;
//双色球案例：生成不重复的6位随机数，第7位可以重复，将用户输入的7个数与生成的7位双色球数进行比对

import java.util.Random;
import java.util.Scanner;

public class 案例7 {
    public static void main(String[] args) {
        int a[] =creatlucknumber();
        int b[]=userinputnumber();
        printarry(a);
        printarry(b);
        judge(a,b);
    }

    public static void judge(int []a,int []b){//a为中奖值，b为用户的数值
         int redcount =0;
        for(int i=1;i<b.length-1;i++){
             for(int j=0;j<a.length-1;j++){
                 if(b[i]==a[j]){
                     redcount++;
                     break;
                 }
        }
        }
      int  bluecount = b[6]==a[6]?1:0; //判断蓝球的数量
        if(bluecount==1&&redcount<3){
            System.out.println("恭喜您，中了5元小奖");
        }else if(bluecount==1&&redcount==3||bluecount==0&&redcount==4){
            System.out.println("恭喜您，中了10元小奖");
        }else if(bluecount==1&&redcount==4||bluecount==0&&redcount==5){
            System.out.println("恭喜您，中了200元大奖");
        }else if(bluecount==1&&redcount==5){
            System.out.println("恭喜您，中了3000元大奖");
        }else if(bluecount==0&&redcount==6){
            System.out.println("恭喜您，中了500万大奖");
        }else if(bluecount==1&&redcount==6){
            System.out.println("恭喜您，中了3000万大奖");
        }else{
            System.out.println("很遗憾，没有中奖，感谢您为福利事业做出的巨大贡献");
        }

    }
    public static void printarry(int arr[]){  //定义一个打印数组的方法
        for(int i=0;i< arr.length;i++){
            System.out.println(i== arr.length-1?arr[i]:arr[i]+",");
        }

    }



    public static int[] userinputnumber(){     //用户输入自己的猜的数
        int [] number =new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< number.length-1;i++){
            System.out.println("请输入第"+(i+1)+"个红球的数值");
            number[i]= sc.nextInt();
        }
        System.out.println("请输入蓝球的数值");
        number[6] = sc.nextInt();
        return number;
    }


    public static int[] creatlucknumber(){    //生成6个红色球的数
        int [] numbers = new int[7];
        Random r = new Random();
        for(int i=0;i< numbers.length-1;i++){   //先读入前6位数

            while(true){
                int data =r.nextInt(32)+1;  //范围在1--32
                //生成一个随机数，并由以下的程序判断当前数据是否与之前的元素重复

                boolean flag =true;
                for(int j=0;j<i;j++){
                    if(numbers[j]==data){
                        flag = false;
                        break;   //重复，退出for循环，进行下一轮while循环，生成一个新的随机数
                    }
                }
                if(flag==true){
                    numbers[i]=data;
                    break;    //退出while死循环
                }
            }
        }
               numbers[6] =r.nextInt(16)+1; //范围在1--16
               return numbers;
    }

}
