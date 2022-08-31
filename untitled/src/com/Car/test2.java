package com.Car;

public class test2 {
    public static void main(String[] args) {
        Student c = new Student(); //根据类student创建一个c对象
        c.name="fx";
        c.score=90;
        System.out.println(c.name);
        System.out.println(c.score);
        c.start();
        c.run();

        System.out.println("---------------------");

        Student c1 = new Student(); // 创建一个c1对象
        c1.name="铁牛";
        c1.score=88;
        System.out.println(c1.name);
        System.out.println(c1.score);
        c1.start();
        c1.run();
    }
}
