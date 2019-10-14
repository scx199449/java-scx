package packageing.lesson01;
//基本数据类型包装类
public class Demo01 {

    public static void main(String[] args) {

        /*基本类型对应的包装类
        byte 	Byte
        short 	Short
        int 	Integer
        long	Long
        float	Float
        double  Double
        char    Character
        boolean Boolean*/

        //Integer类
        //1、构造方法
        //public Integer(int value)
        Integer integer = new Integer(100);
        String s = integer.toString();
        System.out.println(s);

        //2、Integer的静态属性
        System.out.println("int最小值："+Integer.MIN_VALUE);
        System.out.println("int最大值："+Integer.MAX_VALUE);

        //3、Integer的其他方法
        System.out.println(Integer.toBinaryString(8)); //8的二进制
        System.out.println(Integer.toOctalString(9)); //9的八进制
        System.out.println(Integer.toHexString(17)); //17的十六进制

    }

}
