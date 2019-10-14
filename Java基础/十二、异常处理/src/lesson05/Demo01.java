package lesson05;

public class Demo01 {

    public static void main(String[] args) {
        /*多个异常处理注意：
        1.多个异常时，不能把Exception异常放在最前面,相当于Exception是所有异常的父类，先由子类处理，子不能处理，
        再由父类处理
        2.多个异常也还可以用 或| 的方式来写*/

        try {
            //1，有可能出现数组越界异常
            int[] arr = {1,2,3};
            System.out.println(arr[1]);

            //2.算术异常
            int a = 10 / 2;

            //3.空指针异常
            int[] arr1 = null;
            System.out.println(arr1[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
        }catch (ArithmeticException e){
            System.out.println("算数异常");
        }catch (Exception e){
            System.out.println("其他异常");
        }

    }

}
