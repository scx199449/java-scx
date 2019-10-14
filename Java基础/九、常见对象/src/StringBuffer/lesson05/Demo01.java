package StringBuffer.lesson05;
//StringBuffer的截取功能及注意事项
public class Demo01 {

    public static void main(String[] args) {
        /*1、public String substring(int start):
        从指定位置截取到末尾*/
        String s = "Hello,Gosling";
        s = s.substring(0,5);
        System.out.println(s);

        StringBuffer sb = new StringBuffer();
        sb.append("Hello,Gosling");
        System.out.println(sb);
        //这个方法返回值不是StringBuffer是String
        String str = sb.substring(6);
        System.out.println(str);
        String str1 = sb.substring(0,5);
        System.out.println(str1);

        /*2、public String substring(int start,int end):
        截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
        注意事项 :返回值类型不再是StringBuffer本身*/

    }

}
