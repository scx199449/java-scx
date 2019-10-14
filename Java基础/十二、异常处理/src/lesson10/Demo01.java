package lesson10;

public class Demo01 {

    public static void main(String[] args) {
        //finally关键字的特点及作用
        /*finally的特点
                finally的语句体一定会执行
                特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))
        finally的作用
            用于释放资源，在IO流操作和数据库操作中会见到*/

        try{
            int a = 10 / 0;
        }catch (ArithmeticException e) {
            e.printStackTrace();
            //System.exit(0);
        }finally {
            System.out.println("finally的代码块执行了");
        }

    }

}
