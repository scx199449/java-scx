package String.lesson18;
//String类的其它功能
public class Demo01 {

    public static void main(String[] args) {

        //1、public String replace(char oldChar, char newChar) //替换字符
        System.out.println("===========1、public String replace(char oldChar, char newChar)");
        String str1 = "hello";
        str1 = str1.replace('h','H');
        System.out.println("str1 :"+str1);

        //2、public String replace(CharSequence target, CharSequence replacement) //替换字符串
        System.out.println("===========2、public String replace(CharSequence target, CharSequence replacement) //替换字符串");
        String str2 = "I Love You!";
        str2 = str2.replace("Love","Hate");
        System.out.println("str2:"+str2);

        //3、String trim(); //去除前后空格
        System.out.println("===========3、String trim(); //去除前后空格");
        String str3 = " Hello World ";
        str3 = str3.trim();
        System.out.println("str3:"+ str3);

        //4、public int compareTo(String anotherString) //比较
        System.out.println("===========4、public int compareTo(String anotherString) //比较");
        String str4 = "I Love U";
        String str5 = "i love u";
        int i = str4.compareTo(str5);
        System.out.printf("i : %d \n",i);

        //5、public int compareToIgnoreCase(String str) //比较
        System.out.println("===========5、public int compareToIgnoreCase(String str) //比较");
        int i1 = str4.compareToIgnoreCase(str5);
        System.out.printf("i1 :%d \n",i1);

    }

}
