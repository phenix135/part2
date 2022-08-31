package Arraylist;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Movie> movies=new ArrayList<>();

        Movie m1=new Movie("《海上钢琴师》",9.0,"wx");
        Movie m2=new Movie("《摔跤吧，爸爸》",8.6,"文帝");
        Movie m3=new Movie("《复仇者联盟》",9.0,"阿K");
        Movie m4=new Movie("《肖申克的救赎》",9.6,"dd");

        movies.add(m1);  //集合中存储的元素都为一个个对象（地址）
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);

        for (int i = 0; i < movies.size(); i++) {
            Movie m =movies.get(i);
            System.out.println("电影名："+m.getName());
            System.out.println("评分位："+m.getScore());
            System.out.println("演员为"+m.getActor());

        }
    }
}
