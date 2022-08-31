package 构造器;

public class Car {
    String name;
    double  price;

    public Car(){
        System.out.println("--无参数构造器被调用了----");
    }
    public Car(String n,double p){
        System.out.println("--有参数构造器被调用了---");
        name =n;
        price =p;
    }

}
