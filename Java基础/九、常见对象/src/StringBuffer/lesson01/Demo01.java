package StringBuffer.lesson01;
//StringBuffer构造方法
public class Demo01 {

    public static void main(String[] args) {

       /* (一)  StringBuffer类的构造方法*/
        //1、public StringBuffer():【开发中常用此构造方法】
        //构造一个其中不带字符的字符串缓冲区，初始容量为 16 个字符。
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());//内部字符数组的初始容量
        System.out.println(sb1.length());//字符串的长度

        //2、public  StringBuffer(int capacity) :
        //构造一个不带字符，但具有指定初始容量的字符串缓冲区。
        StringBuffer sb2 = new StringBuffer(24);
        System.out.println(sb2.capacity());

        //3、public  StringBuffer(CharSequence seq):
        //构造一个字符串缓冲区，它包含与指定的 CharSequence 相同的字符。
        StringBuffer sb3 = new StringBuffer("sb,你好吗");
        System.out.println(sb3.capacity());

        //4、public  StringBuffer(String str):
        //构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。

    }

}
