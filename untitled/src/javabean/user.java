package javabean;

public class user {
    private String name;
    private  double height;
    private  double slaray;

    public user(){       //无参数构造器

    }

    public user(String name, double height, double slaray) {  //生成有参数构造器
        this.name = name;
        this.height = height;
        this.slaray = slaray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSlaray() {
        return slaray;
    }

    public void setSlaray(double slaray) {
        this.slaray = slaray;
    }
}
