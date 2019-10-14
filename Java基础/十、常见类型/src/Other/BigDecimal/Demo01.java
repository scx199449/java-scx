package Other.BigDecimal;

import java.math.BigDecimal;

//BigDecimal
//以后再公司做金钱结算模块，尽量用BigDecimal
//因为这个类可以减少误差
public class Demo01 {

    public static void main(String[] args) {
        /*BigDecimal的概述
        由于在运算的时候，float类型和double很容易丢失精度。所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal*/

        /*构造方法
        public BigDecimal(String val)*/

        /*成员方法*/
        //public BigDecimal add(BigDecimal augend) +
        BigDecimal bd1 = new BigDecimal("2.0");
        BigDecimal bd2 = new BigDecimal("0.5");
        BigDecimal sum = bd1.add(bd2);
        System.out.println(sum);

        //public BigDecimal subtract(BigDecimal subtrahend) -
        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println(subtract);

        //public BigDecimal multiply(BigDecimal multiplicand) *
        BigDecimal multi = bd1.multiply(bd2);
        System.out.println(multi);

        //public BigDecimal divide(BigDecimal divisor) /
        BigDecimal divide = bd1.divide(bd2);
        System.out.println(divide);

        //在使用BigDecimal做除法运算时，这两个数要能被除尽，否则报错
    }
}
