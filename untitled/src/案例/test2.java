package 案例;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        //将信息存入对象中
        movie2 m1=new movie2("《海上钢琴师》",9.6,"阿K");
        movie2 m2=new movie2("《摔跤吧，爸爸》",9.2,"文帝");
        movie2 m3=new movie2("《肖申克的救赎》",9.0,"阿文");
        movie2 m4=new movie2("《复仇者联盟》",9.4,"杰维斯");

        //将对象存入集合中
        ArrayList<movie2> list=new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        //输出数据
        for(int i=0;i< list.size();i++){
            movie2 m=list.get(i);
            System.out.println("电影名为："+m.getName());
            System.out.println("评分为" +m.getScore());
            System.out.println("演员为："+m.getActor());
        }
    }
}
