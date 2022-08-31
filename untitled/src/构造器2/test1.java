package 构造器2;

import 构造器.Car;

import java.util.concurrent.Callable;

public class test1 {
    public static void main(String[] args) {
        //1.调用无参数构造器
        Car1 c1= new Car1();
        c1.year=100;
        c1.name="fx";
        System.out.println(c1.year);
        System.out.println(c1.name);

        //2.调用有参数构造器
        Car1 c2=new Car1("奔驰",18);
        System.out.println(c2.name);
        System.out.println(c2.year);

        //3.调用方法
        c2.run();//成员方法用的对象名和无参数构造器一样或者与有参数构造器一样
    }
}
