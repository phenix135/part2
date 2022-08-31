package javabean;

public class test1 {
    public static void main(String[] args) {
        //1.用无参数构造器创造一个对象
        User1 c =  new User1();
        c.setName("黑马方鑫");
        c.setHeight(170.5);
        c.setSalary(30000);
        System.out.println(c.getName());
        System.out.println(c.getHeight());
        System.out.println(c.getSalary());

        System.out.println("-------------------");
        User1 c1 =new User1();
        c1.setName("张三");
        c1.setHeight(180);
        c1.setSalary(5000);
        System.out.println(c1.getName());
        System.out.println(c1.getHeight());
        System.out.println(c1.getSalary());

    }
}
