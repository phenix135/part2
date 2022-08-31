package 构造器2;

public class test2 {
    public static void main(String[] args) {
        Car2 c =new Car2();
        c.year=100;
        c.name="fx";
        System.out.println(c.year);
        System.out.println(c.name);

        Car2 c1=new Car2("奔驰",18);
        System.out.println(c1.name);
        System.out.println(c1.year);

        c.run();
        c1.run();
    }
}
