package lesson03;

public class Demo01 {

    public static void main(String[] args) {
        //自己异常处理的两种方式
        /**
         * 方式一：try...catch
         *ArithmeticException 算术异常
         *
         * 方式二:try...catch多个异常
         */
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[2]);//ArrayIndexOutOfBoundsException数组越界异常

            int a = 10/0; //ArithmeticException 算术异常
            System.out.println(a);

            int[] arr1 = null;
            System.out.println(arr1[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常。。。");
        }catch (ArithmeticException e){
            System.out.println("算术异常。。。");
        }
    }

}
