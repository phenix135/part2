package javabean;

public class Car3 {
    private String name;
    private int year;
    private double salary;
    //定义一个无参数构造器
    public Car3() {
        System.out.println("无参数构造器被调用了");
    }

    public Car3(String name, int year, double salary) {
        this.name = name;
        this.year = year;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
