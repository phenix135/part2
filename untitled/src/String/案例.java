package String;

public class 案例 {
    public static void main(String[] args) {
        //String name="我爱你中国love";
        //1.获取字符串的长度
       // System.out.println(name.length());

        //2.获取某个索引处的字符
        //char c =name.charAt(1);
        //System.out.println(c);

        //3.遍历字符串中的每个字符
       /* System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(6));
        System.out.println(name.charAt(7));
        System.out.println(name.charAt(8));  */


    /*  for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }  */
        //4.将字符串转换为字符数组
       /* char [] chars=name.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println(chars[3]);
        System.out.println(chars[4]);  */
      //5.截取内容
      /*  String name2=name.substring(0,9);  包前不包后：索引范围为0-8
        System.out.println(name2);   */

        //6.从当前索引一直截取到末尾
        /*String name1 =name.substring(4);
        System.out.println(name1); */

        //7.替换目标字符
      /*  String name3 ="金三胖是最棒的，我大爱你";
        String name1=name3.replace("金三胖","***");
        System.out.println(name1);  */

        //8.判断是否包含目标字符串
       /* String name="我爱你中国";
        System.out.println(name.contains("中国"));  */

        //9.判断以什么开始
        /* String name="我爱你中国";
        System.out.println(name.startsWith("金三胖"));
        System.out.println(name.startsWith("中国"));  */

        //10.按照某个内容把字符串分割成字符串数组返回
     /*    String name="王宝强,贾乃亮,陈羽凡";
         String []names =name.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }  */

    }

}
