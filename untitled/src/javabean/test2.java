package javabean;

public class test2 {
    public static void main(String[] args) {
        Movie m1 =new Movie("海上钢琴师",9.6,"ww");
        Movie m2 =new Movie("密码",2.6,"ww");
        Movie m3 =new Movie("大拿",8.6,"ww");

        Movie [] movies = new Movie[3];
        movies[0]=m1;
        movies[1]=m2;
        movies[2]=m3;

        for (int i = 0; i < movies.length; i++) {
            Movie m=movies[i];
            System.out.println(m.getName());
            System.out.println(m.getScore());
            System.out.println(m.getActor());
        }
    }
}
