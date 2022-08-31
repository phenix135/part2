package 构造器2;

public class Car1 {
    String name;
    int year;
    public Car1(){
        System.out.println("------调用无参数变量-----");
        System.out.println("this在构造器中为"+this);
    }
    public Car1(String name,int year){
        System.out.println("-----调用有参数变量----");
        this.name=name;
        this.year=year;
    }

    public  void run(){
        System.out.println("this在方法中"+this);
    }


}
