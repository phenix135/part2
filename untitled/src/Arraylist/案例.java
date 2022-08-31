package Arraylist;

import java.util.ArrayList;

public class 案例 {
    public static void main(String[] args) {
        ArrayList <String>list =new ArrayList<>();
        list.add("java");
        list.add("是最棒");
        list.add("的编程语言");
        //String e= list.get(2);
        list.set(0,"c++");
        System.out.println(list);
    }
}
