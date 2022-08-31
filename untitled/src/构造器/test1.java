package 构造器;

public class test1 {
    public static void main(String[] args) {

        Car1 c1 =new Car1();//1.建立一个无参数对象c1
        c1.name="黑马方鑫";
        c1.year=19;
        c1.salary=30000;
        System.out.println("名叫"+ c1.name);
        System.out.println("年龄" + c1.year);
        System.out.println("薪水"+ c1.salary);

        System.out.println("------------------");
        //2.创建一个有参数对象
        Car1 c2 =new Car1("白马方宇",16,5000);
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.salary);
    }
}
