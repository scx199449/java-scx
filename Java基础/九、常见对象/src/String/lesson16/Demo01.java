package String.lesson16;
//统计不同类型字符个数
public class Demo01 {

    public static void main(String[] args) {
        String password = "abc23Asd^4";

        int big = 0;
        int small = 0;
        int num = 0;
        int other = 0;

        for (int i = 0;i < password.length();i++) {
            char ch = password.charAt(i);
            //判断是否为大写
            if(ch >= 'A' && ch < 'Z'){
                big++;
            }else if(ch >= 'a' && ch < 'z'){
                small++;
            }else if('0' <= ch && ch <= '9') {
                num++;
            }else{
                other++;
            }

        }
        System.out.println(big+","+small+","+num+","+other);
    }

}
