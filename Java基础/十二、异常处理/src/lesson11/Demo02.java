package lesson11;

public class Demo02 {

    public static void main(String[] args) {
        //面试题
        /*2.如果catch里面有return语句，请问finally的代码还会执行吗?如果会，请问是在return前还是return后？*/

        int r = getDiv(10,0);
        System.out.println("r :"+r);
    }

    //返回a/b的结果
    public static int getDiv(int a,int b){
        int i = 0;
        try{
            i = a / b;
            return i;
        }catch (ArithmeticException e){
            System.out.println("算术异常-除数不能为0");
            i = -1;
            return i;//已经记住是-1，所以finally中怎么修改值都不变，
                     // 除非finally中有return(最好不要在finally中写return)
        }finally {
            System.out.println("finally代码执行了...");
            i = -2;
        }
    }

}
