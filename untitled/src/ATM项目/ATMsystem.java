package ATM项目;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ATMsystem {
    public static void main(String[] args) {
        //1.定义一个类
        //2.定义一个账户类集合，存储账户对象
        ArrayList<Account> accounts=new ArrayList<>();
        //3.展示系统的首页
        Scanner sc =new Scanner(System.in);
        while(true) {
            System.out.println("===============ATM黑马================");
            System.out.println("1.账户登录");
            System.out.println("2.账户开户");
            System.out.println("请您输入指令：");

            int command = sc.nextInt();
            switch (command) {

                case 1:
                    //账户登录
                    login( accounts,sc);
                    break;
                case 2:
                    //账户开户
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("对不起，您输入的指令错误！");
            }
        }
    }

    /**登录的方法
     *
     * @param accounts
     * @param sc
     */
    public static void login(ArrayList<Account> accounts,Scanner sc){
        System.out.println("============登录操作===============");
     //1.判断集合中时候是否有账户
        if(accounts.size()==0){
            System.out.println("对不起，当前系统没有用户，请先开户，再进行登录");
            return; //当系统中没有账户时，结束方法
        }
        //2.正式进入登录操作
        while(true) {
            System.out.println("请您输入卡号：");
            String cardid = sc.next();
            //3.判断卡号是否存在，用卡号去查询集合中对象（通过方法实现）
            //该账号在集合中存在，所以输出一个对象 g
            Account acc = getAccountbycardid(accounts, cardid);
            if (acc != null) {
                while (true) {
                    //此账号存在,接着判断密码是否正确
                    System.out.println("请输入密码：");
                    String password = sc.next();
                    if (acc.getPassword().equals(password)) {
                        System.out.println("登录成功,"+acc.getUsername()+"先生/女士您进入系统，您的卡号为"+acc.getCardid());
                        //查询，存钱，取钱

                        showusercommand(sc,acc,accounts);
                        return;

                    } else {
                        System.out.println("您输入的密码有误，请重新输入");
                    }
                }
            }else {
                System.out.println("对不起，卡号不存在");
            }

        }
    }

      public static void showusercommand(Scanner sc,Account acc,ArrayList<Account> accounts){
        while(true) {
            System.out.println("===============用户操作页==================");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.销户");
            System.out.println("请输入指令：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查寻账户(展示账户的信息）
                    showAccount(acc);
                    break;
                case 2:
                    //存款
                    depositmoney(acc,sc);
                    break;
                case 3:
                    //取款
                    drawmoney(acc,sc);
                    break;
                case 4:
                    //转账,acc为当前账户
                    transformoney(sc,acc,accounts);
                    break;
                case 5:
                    //修改密码
                    updatapassword(sc,acc);
                    return;
                case 6:
                    //退出
                    System.out.println("退出成功，欢迎下次光临");
                    return;//退出当前方法
                case 7:
                    //注销账户
                    //从当前集合移除对象

                   if( deleteAccount(acc,sc,accounts)){
                       return;
                   }else{
                       break;
                   }
                default:
                    System.out.println("您当前输入的指令错误");
            }
        }
      }

    /**
     * 销户方法
     * @param acc
     * @param sc
     * @param accounts
     */
      public static Boolean deleteAccount(Account acc,Scanner sc,ArrayList<Account> accounts) {
          System.out.println("==============用户销户==============");
          System.out.println("您真的要销户？y/s");
          String rs =sc.next();
          switch(rs){
              case "y":
                  //判断有没有钱
                  if(acc.getMoney()>0){
                      System.out.println("账户还有钱，不允许销户");
                  }else{
                      accounts.remove(acc);
                      System.out.println("您销户成功");
                      return true;
                  }
                  break;

              default:
                  System.out.println("好的，当前账户继续保留");
          }
         return  false;
      }
    /**
     * 修改密码方法
     */
   public static void updatapassword(Scanner sc,Account acc){
       System.out.println("===============用户修改密码操作===================");
       System.out.println("请你输入当前密码：");
       String password =sc.next();
       if(acc.getPassword().equals(password)) {
           while (true) {
               System.out.println("请您输入新密码：");
               String newpassword = sc.next();
               System.out.println("请您确认新密码：");
               String okpassword = sc.next();
               if (newpassword.equals(okpassword)) {
                   //两次密码一致
                   acc.setPassword(newpassword);
                   System.out.println("您修改密码成功！");
                   return;//退出方法
               } else {
                   System.out.println("您两次输入的密码不一致");
               }
           }
       }else{
           System.out.println("您的密码错误！");
       }



   }


    /**
     * 转账功能
     * @param sc
     * @param acc
     * @param accounts
     */
      public static void transformoney(Scanner sc,Account acc,ArrayList<Account> accounts){
          System.out.println("==========用户转账功能=============");
          //1.判断是否有2个以上的用户
          if(accounts.size()<2){
              System.out.println("对不起，当前系统中只有一个账户，无法完成转账，请添加账户");
              return; //退出方法
          }
          //2. 判断账户是否有钱
          if(acc.getMoney()==0){
              System.out.println("对不起，您自己都没有钱，就别转了");
              return;
          }
          //3,有两个用户，有钱，开始转账
          while(true) {
              System.out.println("请您输入对方的卡号");
              String cardid = sc.next();

              if(acc.getCardid().equals(cardid)){
                  System.out.println("对不起，您不能给自己进行转账");
                  continue; //结束当次循环
              }

              //4,通过卡号，得到对方的对象
              Account account = getAccountbycardid(accounts, cardid);
              if (account == null) {
                  System.out.println("对不起，卡号不存在，请重新输入");
              }else{
                  //这个账户存在，接下来确认姓氏
                  String username =account.getUsername();//黑马周芷若
                  String tip ="*"+username.substring(1);
                  System.out.println("请输入"+tip+"的姓氏");
                  String prename =sc.next();

                  //认证姓氏是否正确

                  if(username.startsWith(prename)){
                      //认证通过
                      while(true) {
                          System.out.println("请输入转账金额");
                          double money = sc.nextDouble();
                          if (money > acc.getMoney()) {
                              System.out.println("对不起，金额不足，您最多可以转账" + acc.getMoney() + "元");
                          } else {
                                 acc.setMoney(acc.getMoney()-money); //自己账户
                                 account.setMoney(account.getMoney()+money);//对方账户
                              System.out.println("您转账成功，您的账户还有"+acc.getMoney()+"元");
                              return;
                          }
                      }
                  }else{
                      System.out.println("对不起，您输入的姓氏不正确");
                  }

              }


          }
      }



    /**
     * 用户取钱
     *
     *
     */
      public static void drawmoney(Account acc,Scanner sc){
          System.out.println("===============用户取钱操作=====================");

             //判断是否够100元
             if (acc.getMoney() < 100) {
                 System.out.println("对不起，当前账户中不够100元，不能取钱");
                 return;//结束方法
             }
          while(true) {
             System.out.println("请您输入取款金额");
             double money = sc.nextDouble();

             if (money > acc.getQuotamoney()) {
                 System.out.println("对不起，您当前取款金额超过限额，每次最多可取" + acc.getQuotamoney());
             }else{
                    if(money>acc.getMoney()){
                        System.out.println("对不起，金额不够，余额为"+acc.getMoney());
                    }else{
                        //可以取钱
                        System.out.println("恭喜您，取钱"+money+"元");
                        //更新余额
                        acc.setMoney(acc.getMoney()-money);
                        //展示账户
                        showAccount(acc);
                        return ;//结束方法
                      }
             }
         }

      }

    /**
     * 存储现金
     * @param acc
     * @param sc
     */
      public static void depositmoney(Account acc,Scanner sc){
          System.out.println("==============用户存钱操作==============");
          System.out.println("请您输入存款金额：");
          double money=sc.nextDouble();
          acc.setMoney(acc.getMoney()+money);
          System.out.println("存钱成功！当前账户信息如下");

          showAccount(acc);
      }

    /**
     * 展现用户的信息
     * @param acc
     */
    public static void showAccount(Account acc){
          System.out.println("==================当前账户的信息如下========================");
          System.out.println("卡号为："+acc.getCardid());
          System.out.println("户主为："+acc.getUsername());
          System.out.println("余额为："+acc.getMoney());
          System.out.println("每次限额为："+acc.getQuotamoney());

      }







     public static void register(ArrayList<Account> accounts,Scanner sc){
         System.out.println("===============系统开户操作=================");
         //1.创建一个账户对象，用于封装数据
         Account account=new Account();

         //2,录入这个账户的信息，注入到对象中去

             System.out.println("请您输入用户名：");
             String username = sc.next();
             account.setUsername(username);

         while(true) {
             System.out.println("请您输入用户密码：");
             String password = sc.next();
             System.out.println("请输入确认密码：");
             String okpassword = sc.next();
             if (password.equals(okpassword)) {
                 //.将密码注入对象中
                 account.setPassword(password);
                 break;
             } else {
                 System.out.println("2次密码不一致，请重新输入");
             }
         }

         System.out.println("请输入当次限额：");
         double quotamoney =sc.nextDouble();
         account.setQuotamoney(quotamoney);

         //为账户生成8位随机不重复的卡号(单独生成一方法）
         String cardid=getRandomcardid(accounts);
         account.setCardid(cardid);
       //将账户放入集合中
         accounts.add(account);
         System.out.println("恭喜你"+username+"先生/女士开户成功！"+"您的卡号为"+cardid);
     }


     public static String getRandomcardid(ArrayList<Account> accounts){
         Random r = new Random();
         while(true) {
             //1.生成8位随机数
             String cardid = "";
             for (int i = 0; i < 8; i++) {
                 cardid += r.nextInt(10);
             }
             //2,判断8位的卡号是否与系统中的其他卡号重复
             Account acc = getAccountbycardid(accounts, cardid);
             if (acc == null) {
                 return cardid;
             }
         }
     }
     /**
      根据卡号查询账号信息

     */
     public static Account getAccountbycardid(ArrayList<Account> accounts,String cardid){
         for (int i = 0; i < accounts.size(); i++) {
             Account acc =accounts.get(i);
             if(acc.getCardid().equals(cardid)){
                 //卡号重复
                 return acc;
             }
             }
         return null;
         }
     }

