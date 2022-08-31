package javabean;

public class test {
    public static void main(String[] args) {
        user c1 =new user();
        c1.setName("fx");
        c1.setHeight(170.5);
        c1.setSlaray(1000.0);
        System.out.println("姓名为"+ c1.getName());
        System.out.println("身高为"+ c1.getHeight());
        System.out.println("薪水为"+ c1.getSlaray());

    }
}
