package Other.BigInteger;

import java.math.BigInteger;

//BigInteger类的概述和方法使用
public class Demo01 {
    public static void main(String[] args) {

        /*BigInteger的概述
        可以让超过Integer范围内的数据进行运算*/

        /*构造方法
        public BigInteger(String val)*/

        /*成员方法*/
        BigInteger bi1 = new BigInteger("2147483647");
        BigInteger bi2 = new BigInteger("2147483647");

        //public BigInteger add(BigInteger val)  +
        BigInteger sum = bi1.add(bi2);
        System.out.println(sum);

        //public BigInteger subtract(BigInteger val)  -
        BigInteger substract = bi1.subtract(bi2);
        System.out.println(substract);

        //public BigInteger multiply(BigInteger val) *
        BigInteger multiply = bi1.multiply(bi2);
        System.out.println(multiply);

        //public BigInteger divide(BigInteger val)   /
        BigInteger divide = bi1.divide(bi2);
        System.out.println(divide);

        //public BigInteger[] divideAndRemainder(BigInteger val)   %
        BigInteger[] bis =  bi1.divideAndRemainder(bi2);
        System.out.println("商："+bis[0]);
        System.out.println("余数："+bis[1]);

    }

    /**
     * 掌握两个最大的int值，或者long值进行运行，结果超出int/long的取值范围
     * 所以运算结果不对
     */

    //选中代码，快捷键ctrl+Alt+M
    public static void test01() {
        System.out.println("Max int:"+Integer.MAX_VALUE);
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = a + b;
        System.out.println(c);

        long d = Long.MAX_VALUE;
        long e = Long.MAX_VALUE;
        long f = d + e;
        System.out.println(f);
    }
}
