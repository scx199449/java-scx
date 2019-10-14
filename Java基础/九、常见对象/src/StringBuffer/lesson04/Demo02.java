package StringBuffer.lesson04;
//反转功能
public class Demo02 {

    public static void main(String[] args) {

         /* (二)  StringBuffer的反转功能
        public StringBuffer reverse():
        字符串反转*/

        String s = "abc";
        //把String类型包装成StringBuffer
        StringBuffer sb = new StringBuffer(s);
        //把字符串反转
        sb.reverse();
        System.out.println(sb);

    }

}
