package Math.lesson01;
//Math类
public class Demo01 {
    public static void main(String[] args) {
        //1、public static int abs(int a) 取绝对值
        System.out.println(Math.abs(-110));

        //2、public static double ceil(double a) //向上取整
        // 返回大于或等于参数的最小（最接近负无穷大） double值，等于一个数学整数。
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.ceil(-3.14));

        //3、public static double floor(double a) //向下取整
        //返回小于或等于参数的最大（最接近正无穷大） double值，等于一个数学整数。
        System.out.println(Math.floor(3.14));
        System.out.println(Math.floor(-3.14));

        //4、public static int max(int a,int b) 取最大值
        System.out.println(Math.max(3,5));
        System.out.println(Math.min(3,4));

        //5、public static double pow(double a,double b) a^b a的b次方
        //将第一个参数的值返回到第二个参数的幂。
        System.out.println(Math.pow(2,3));

        //6、public static double random() 生成0~0.99999的随机数
        System.out.println(Math.random());


        //7、public static int round(float a) 四舍五入取整数
        //返回参数中最接近的 int ，其中 int四舍五入为正无穷大。
        System.out.println(Math.round(3.56));

        //8、public static double sqrt(double a) 值的平方根
        System.out.println(Math.sqrt(16));
    }
}
