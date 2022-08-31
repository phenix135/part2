package javabean;

public class test3 {
    public static void main(String[] args) {
        Car3 c1 =new Car3();
        c1.setName("黑马方鑫");
        c1.setYear(19);
        c1.setSalary(30000);

        //输出写法1
        System.out.println(c1.getName());
        System.out.println(c1.getYear());
        System.out.println(c1.getSalary());


        System.out.println("----------------");

        Car3 c2 =new Car3("白马方宇",16,50000);
        System.out.println(c2.getName());
        System.out.println(c2.getYear());
        System.out.println(c2.getSalary());


    }
}