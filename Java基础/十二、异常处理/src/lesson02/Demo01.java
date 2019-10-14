package lesson02;

public class Demo01 {

    public static void main(String[] args) {
        //自己异常处理的两种方式
        /**
         * 方式一：try...catch
         *ArithmeticException 算术异常
         */

       /* try {
            int a = 10/0;
        }catch (ArithmeticException e){
            System.out.println("算术异常，除数不能为0");
        }*/
        try {
            int a = 10/0;
        }catch (Exception e){
            System.out.println(e.getClass());//多态的写法
            System.out.println("算术异常，除数不能为0");
        }

    }

}
