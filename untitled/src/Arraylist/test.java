package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //1.创建学生对象封装数据，直接将对象并入集合
        ArrayList<Student> Students = new ArrayList<>();

        Students.add(new Student("20210301", "小方", 19, "高一7班"));
        Students.add(new Student("20210302", "小李", 19, "高一11班"));
        Students.add(new Student("20210303", "小王", 19, "高一4班"));
        Students.add(new Student("20210304", "小张", 19, "高一5班"));
        //2.遍历输出所有的数据
        for (int i = 0; i < Students.size(); i++) {
            Student m = Students.get(i);
            System.out.println(m.getStudynumber());
            System.out.println(m.getName());
            System.out.println(m.getAge());
            System.out.println(m.getClassname());
        }
        //4,建立扫描器
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入学号：");
            String studynumber = sc.next();
            Student c = getStudentByNumber(Students, studynumber);
            if (c == null) {
                System.out.println("查无此人");

            } else {
                System.out.println("您查询的信息如下");
                System.out.println("学号为：" + c.getStudynumber() + "姓名为：" + c.getName() + "年龄为" + c.getAge()+ "班级为：" + c.getClassname());
            }
        }
    }
        //3.建立方法
        public static Student getStudentByNumber(ArrayList<Student> Students,String studynumber){
            for (int i = 0; i < Students.size(); i++) {
                Student s = Students.get(i);
                if(s.getStudynumber().equals(studynumber)){
                    return s;
                }
            }
            //查无此人
            return null;

        }


}
