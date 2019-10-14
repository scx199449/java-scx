package StringBuffer.lesson06;
//StringBuffer和String的相互转换
public class Demo01 {

    public static void main(String[] args) {

        /*(一)  String –> StringBuffer
        1、通过构造方法
        2、通过append()方法*/
        String s = "Hello,GosLing,Thx";
        //1、
        StringBuffer sb1 = new StringBuffer(s);
        System.out.println(sb1);

        //2、
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);
        System.out.println(sb2);


        /*(二)  StringBuffer -> String*/
        //1、通过构造方法
        StringBuffer sb = new StringBuffer("Hello,GosLing,Thx");
        String str1 = new String(sb);

        //2、通过toString()方法
        String str2 = sb.toString();//最方便

        //3、通过subString(star,end);
        String str3 = sb.substring(0);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }

}
