package 构造器2;

public class Car2 {
    String name;
    int year;
    public Car2(){
        System.out.println("-----调用无参数构造器------");
    }

    public Car2(String name,int year){
        System.out.println("----调用有参数构造器----");
        this.name=name;
        this.year=year;
    }
    public void run(){
        System.out.println("您成功调用成员行为方法");
    }
}
