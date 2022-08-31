package demon;

import java.util.Scanner;

public class demon1 {
    public static void main(String[] args) {
        //1.定义商品类
        //2.定义购物车对象，用数组表示
        goods[] shopcar = new goods[100];
        //3.搭建操作架构
        while (true) {
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购买商品的金额：pay");

            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入命令：");
            String command = sc.next();

            switch (command) {
                case "add":
                    addgoods(shopcar, sc);
                    break;
                case "query":
                    querygoods(shopcar);
                    break;
                case "update":
                    updategoods(shopcar,sc);
                    break;
                case "pay":
                    paygoods(shopcar);
                    break;
            }
        }
    }
   public static void addgoods(goods[] shopcar,Scanner sc){
       System.out.println("请输入购买商品的编号：");
       int id= sc.nextInt();
       System.out.println("请输入购买商品的名称：");
       String name =sc.next();
       System.out.println("请输入购买商品的数量·：");
       int buynumber=sc.nextInt();
       System.out.println("请输入购买商品的价格：");
       double price = sc.nextDouble();

       goods g=new goods();
       g.id=id;
       g.name=name;
       g.buynumber=buynumber;
       g.price=price;
       for (int i = 0; i < shopcar.length; i++) {
           if(shopcar[i]==null){
               shopcar[i]=g;
               break;
           }

       }
       System.out.println("您的"+g.name+"添加购物车完成！");
   }
    public static void querygoods(goods[] shopcar){
        System.out.println("----查询购物车信息如下-----");
        System.out.println("编号\t\t名称\t\t价格\t\t购买数量");
        for (int i = 0; i < shopcar.length; i++) {
            goods g =shopcar[i];

            if(g !=null){
                System.out.println(g.id+"\t"+g.name+"\t"+g.price+"\t"+g.buynumber);

            }else {
                break;
            }

        }
    }
    public static void updategoods(goods[] shopcar,Scanner sc){// 修改商品的编号
       while(true) {
           System.out.println("请输入要修改的商品的id:");
           int id = sc.nextInt();
           goods g = getgoodsbyid(shopcar, id);
           if (g == null) {
               System.out.println("对不起，没有购买该商品");
           } else {
               System.out.println("请您请输入" + g.name + "商品最新购买数量：");
               int buynumber = sc.nextInt();
               System.out.println("修改完成!");
               querygoods(shopcar);
               break;
           }
       }
    }

    public static goods getgoodsbyid(goods[] shopcar,int id){
        for (int i = 0; i < shopcar.length; i++) {
            goods g =shopcar[i];
            if(g!=null) {
                if (g.id == id) {
                    return g;
                }
            }else{
                    return null; //找完了前面存在的商品，没有找到
                }

        }
        return null;  //证明找完了，都没有id一样的商品
    }
    public static void paygoods(goods[] shopcar){
        double money =0;
        for (int i = 0; i < shopcar.length; i++) {
            goods g =shopcar[i];
            if(g!=null){
                money += g.price*g.buynumber;
            }else{
                break;
            }
        }
        System.out.println("总价为"+money);
    }



}
