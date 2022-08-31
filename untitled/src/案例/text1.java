package 案例;
           //用数组存储对象的地址
public class text1 {
    public static void main(String[] args) {
        //存入电影的信息
        movie1 m1=new movie1("《海上钢琴师》",9.6,"阿K");
        movie1 m2=new movie1("《摔跤吧，爸爸》",9.2,"文帝");
        movie1 m3=new movie1("《肖申克的救赎》",9.0,"阿文");
        movie1 m4=new movie1("《复仇者联盟》",9.4,"杰维斯");

        //定义一个movie1类的数组，存储电影数据
        movie1 []movies=new movie1[4];
        movies[0]=m1;
        movies[1]=m2;
        movies[2]=m3;
        movies[3]=m4;

        //输出数组中的信息
        for (int i = 0; i < movies.length; i++) {
            movie1 m=movies[i];
            System.out.println("电影名为："+m.getName());
            System.out.println("评分为："+m.getScore());
            System.out.println("演员为："+m.getActor());
        }
    }
}
