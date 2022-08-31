package String;

import java.util.Random;

public class 生成5位随机验证码 {
    public static void main(String[] args) {
        String data ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r =new Random();
        String code="";
        for(int i =0;i<5;i++){
            int index =r.nextInt(data.length());
            char ch =data.charAt(index);
            code +=ch;
        }
        System.out.println(code);
    }

}
