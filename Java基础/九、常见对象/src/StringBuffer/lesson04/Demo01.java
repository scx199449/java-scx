package StringBuffer.lesson04;
//StringBuffer的替换
public class Demo01 {

    public static void main(String[] args) {

       /* (一)  StringBuffer的替换功能
        public StringBuffer replace(int start,int end,String str):
        从start开始到end用str替换*/

       StringBuffer sb = new StringBuffer();
       sb.append("Hello,Gosling,How are you");
       sb = sb.replace(6,13,"gyf");
       System.out.println(sb);
    }

}
