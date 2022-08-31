package String;

import java.util.Scanner;

public class 模拟密码登录系统 {
    public static void main(String[] args) {
        String okloginname="admin";  //正确的用户名
        String  okpassword ="itheima";//正确的密码

        Scanner ch =new Scanner(System.in);
        for (int i = 0; i < 3; i++) {       // 有三次输入的机会admin
            System.out.println("请输入您的登录名称：");
            String loginname=ch.next();
            System.out.println("请您输入您的密码：");
            String password= ch.next();
        if(loginname.equals(okloginname)){
            if(okpassword.equals(password)){
                System.out.println("您成功登录！");
                break;
            }else{
                System.out.println("密码错错误,您还有"+(3-1-i)+"次机会输入");

            }
        }else{
            System.out.println("登录名称错误，"+(3-1-i)+"次机会输入");

        }
        }
    }
}
