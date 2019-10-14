package String.lesson14;

//字符串的遍历
public class Demo01 {

    public static void main(String[] args) {

        String s = "Gosling";
        for (int i = 0;i < s.length();i++) {
            System.out.println(s.charAt(i));
        }

        //面试题：数组有没有length方法，String有没有length属性
        //数组没有length方法，只有length属性
        //String只有length方法，而没有length属性
    }

}
