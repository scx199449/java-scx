package StringBuffer.lesson07;

public class Demo01 {

    public static void main(String[] args) {
        /*2道面试题
        StringBuffer和StringBuilder的区别
        StringBuffer是jdk1.0版本的，是线程安全的，效率低,方法前方有synchronized，同步锁
        StringBuilder是jdk1.5版本的，是线程不安全的，效率高，方法没有锁

        String 和StringBuffer,StringBuilder的区别
        String是一个不可变的字符序列
        StringBuffer,StringBuilder是可变的字符序列*/

        StringBuffer buffer = new StringBuffer();
        buffer.append("abc");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder();
        builder.append("abc");
        System.out.println(builder);

    }

}
