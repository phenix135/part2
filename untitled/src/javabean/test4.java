package javabean;

public class test4 {
    public static void main(String[] args) {
       //1.定义四个对象，每个对象都对应一部电影
        Movie4 m1 =new Movie4("海上钢琴师",9.6,"sun");
        Movie4 m2 =new Movie4("三傻大闹宝莱坞",8.6,"阿K");
        Movie4 m3 =new Movie4("摔跤吧，爸爸",9.2,"文帝");
        Movie4 m4 =new Movie4("复仇者联盟",9.0,"sun");
        //2.定义一个Movie4型的数组，里面装的是m1,m2,m3的地址
        Movie4 []movies =new Movie4[4];
        movies[0]=m1;
        movies[1]=m2;
        movies[2]=m3;
        movies[3]=m4;
        //3.遍历数组并输出每个对象的数据
        for (int i = 0; i < movies.length; i++) {
            Movie4 g =movies[i];
            System.out.println("电影名称为:"+g.name);
            System.out.println("电影评分为:"+g.score);
            System.out.println("演员为:"+g.actor);
            System.out.println(); //换行符

        }
    }
}
