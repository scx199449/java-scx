package lesson07;

public class Demo01 {

    public static void main(String[] args) {
        /*Exception是一个继承Throwable的子类
        Throwable有几个常用的方法【了解即可，平时都不怎么用】
            getMessage():获取异常信息，返回字符串。
            toString():获取异常类名和异常信息，返回字符串。
            printStackTrace():打印异常类名和异常信息，以及异常出现在程序中的位置*/

        try {
            int a = 10 / 0;
        }catch (ArithmeticException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println("算术异常");
        }


    }

}
