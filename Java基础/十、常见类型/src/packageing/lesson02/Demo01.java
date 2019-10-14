package packageing.lesson02;
//String和int的相互转换
public class Demo01 {

    public static void main(String[] args) {

        //(一)  int 转 String
        int a = 120;
        //1、和""进行拼接
        String s1 = a + "";
        System.out.println("s1:"+s1);

        //2、public static String valueOf(int i) （String类方法）
        String s2 = String.valueOf(a);
        System.out.println("s2:"+s2);

        //3、int -- Integer -- String(Integer类的toString方法())
        Integer integer = new Integer(a);
        String s3 = integer.toString();
        System.out.println("s3:"+s3);

        //4、public static String toString(int i)(Integer类的方法)
        String s4 = Integer.toString(a);
        System.out.println("s4:"+s4);

        /*(二)  String 转 int*/
        //1、String -- Integer – int
        String str = "520";
        Integer integer1 = new Integer(str);
        int b = integer1.intValue();
        System.out.printf("b:%d \n",b);

        //2、public static int parseInt(String s)
        int c = Integer.parseInt(str);
        System.out.printf("c:%d \n",c);

    }
}
