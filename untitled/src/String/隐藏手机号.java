package String;

import java.util.Scanner;

public class 隐藏手机号 {  //输出形式为1778***9649
    public static void main(String[] args) {
        Scanner ch =new Scanner(System.in);
        System.out.println("请您输入您的手机号：");
        String tel = ch.next();

        String r1 =tel.substring(0,4);
        String r2 =tel.substring(7);
        String r3=r1+"***"+r2;

        System.out.println(r3);
    }
}
