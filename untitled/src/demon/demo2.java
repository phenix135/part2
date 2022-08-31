package demon;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        good2 []shopcar=new good2[100];

while(true) {
    System.out.println("请您输入以下操作：");
    System.out.println("添加商品：add");
    System.out.println("更新商品：update");
    System.out.println("查询商品：query");
    System.out.println("结算金额:pay");

    System.out.println("请您输入指令：");
    Scanner sc = new Scanner(System.in);
    String command = sc.next();

    switch (command) {

        case "add":
            //添加商品
            add(shopcar,sc);
            break;
        case "update":
            //修改商品
            break;
        case "query":
            //查看商品
            break;
        case "结算金额":
            //结算金额
            break;
        default:
            System.out.println("您输入的指令错误！请重新输入");
        }
      }
    }
    public static void add(good2[]shopcar,Scanner sc){
        good2 g=new good2();
        System.out.println();





    }


}
