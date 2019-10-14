package String.lesson17;
//String类的转换功能
public class Demo01 {

    public static void main(String[] args) {

        //1、byte[] getBytes():把字符串转换为字节数组
        System.out.println("=================1、byte[] getBytes():把字符串转换为字节数组");
        String str1 = "520java";
        byte[] bytes = str1.getBytes();
        for (int i = 0;i < bytes.length;i++){
            System.out.println(bytes[i]);
        }

        //2、char[] toCharArray()：把字符串转换为字符数组
        System.out.println("=================2、char[] toCharArray()：把字符串转换为字符数组");
        String str2 = "java";
        char[] chars = str2.toCharArray();
        for (int i = 0;i < chars.length;i++){
            System.out.println(chars[i]);
        }

        //3、static String valueOf(char[] chs)：把字符数组转成字符串
        System.out.println("=================3、static String valueOf(char[] chs)：把字符数组转成字符串");
        char[] chs = {'L','O','V','E'};
        String str3 = String.valueOf(chs);
        System.out.println("str3="+ str3);

        //4、static String valueOf(int i)：把int类型的数据转成字符串
        //注意:String类的valueOf方法可以把任意类型的数据转成字符串
        System.out.println("=================4、static String valueOf(int i)：把int类型的数据转成字符串");
        System.out.println(String.valueOf(97));

        //5、String toLowerCase()：把字符串转成小写
        System.out.println("=================5、String toLowerCase()：把字符串转成小写");
        String str4 = "HELLO,HOW ARE YOU!";
        str4 = str4.toLowerCase();
        System.out.println("str4="+str4);

        //6、String toUpperCase()：把字符串转成大写
        System.out.println("=================6、String toUpperCase()：把字符串转成大写");
        String str5 = "hi,麻辣鸡丝";
        str5 = str5.toUpperCase();
        System.out.println("str6 = "+str5);

        //7、String concat(String str)：把字符串拼接,且只能拼接字符串。+方式拼接字符串时，可以是任意类型
        System.out.println("=================7、String concat(String str)：把字符串拼接,且只能拼接字符串,+方式拼接字符串时，可以是任意类型");
        String str6 = "When";
        String str7 = " you go home?";
        //String str8 = str6.concat(str7);
        String str8 = str6 + str7;
        System.out.println("str8 = " + str8);

    }

}
