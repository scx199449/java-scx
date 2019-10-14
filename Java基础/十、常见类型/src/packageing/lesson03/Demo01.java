package packageing.lesson03;
//自动装箱和拆箱
public class Demo01 {

    public static void main(String[] args) {
        //自动装箱：把基本类型转换为包装类类型
        Integer i1 = 10;//内部会自动new Integer(10)

        //自动拆箱：把包装类类型转换为基本类型
        Integer i2 = new Integer(120);
        int a = i2;


    }
}
