package Arraylist;

public class Student {
    private  String studynumber;
    private String  name;
    private int age;
    private String classname;

    public Student() {
    }

    public Student(String studynumber, String name, int age, String classname) {
        this.studynumber = studynumber;
        this.name = name;
        this.age = age;
        this.classname = classname;
    }

    public String getStudynumber() {
        return studynumber;
    }

    public void setStudynumber(String studynumber) {
        this.studynumber = studynumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
