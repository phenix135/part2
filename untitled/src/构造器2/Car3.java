package 构造器2;

public class Car3 {
    String name;
    int age;
    public Car3(){
        System.out.println("无参构造器被调用了");
    }

    public Car3(String name,int age){
        System.out.println("有参构造器被调用了");
        this.name=name;
        this.age=age;
    }
}
