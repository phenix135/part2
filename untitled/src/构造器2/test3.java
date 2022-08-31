package 构造器2;

public class test3 {
    public static void main(String[] args) {
        Car3 c1=new Car3();
        c1.name="贾维斯";
        c1.age=19;
        System.out.println(c1.name);
        System.out.println(c1.age);

        Car3 c2=new Car3("东坡",11);
        System.out.println(c2.name);
        System.out.println(c2.age);
    }
}
