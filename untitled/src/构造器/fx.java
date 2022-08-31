package 构造器;

public class fx {
    public static void main(String[] args) {
        Car c1 =new Car();
        c1.name="熊二";
        c1.price=199;
        System.out.println(c1.name);
        System.out.println(c1.price);

        Car c2=new Car("奔驰",39.8);
        System.out.println(c2.name);
        System.out.println(c2.price);
    }

}
