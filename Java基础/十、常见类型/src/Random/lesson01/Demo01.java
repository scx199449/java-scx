package Random.lesson01;

import java.util.Random;

//Random类
public class Demo01 {
    public static void main(String[] args) {
        /*(一)  Random类的概述
        1、此类用于产生随机数
        2、如果用相同的种子创建两个 Random 实例，则对每个实例进行相同的方法调用序列，它们将生成 并返回相同的数字序列。*/

        /*(二)  构造方法*/
        //1、public Random()
        //2、public Random(long seed)

        /*(三)  成员方法*/
        //1、public int nextInt()
        //2、public int nextInt(int bound)(重点掌握)


        //test1();

        //如果用相同的种子创建两个 Random 实例，则对每个实例进行相同的方法调用序列，
        // 它们将生成并返回相同的数字序列。
        Random r1 = new Random(10000);
        Random r2 = new Random(10000);
        System.out.println(r1.nextInt());
        System.out.println(r2.nextInt());

        System.out.println("==================");
        System.out.println(r1.nextInt());
        System.out.println(r2.nextInt());
    }

    public static void test1() {
        //1、创建Random实例
        Random r1 = new Random();
       /* for (int i = 0;i < 10;i++){
            System.out.println(r1.nextInt());
        }*/

        for (int i=0;i<10;i++){
            System.out.println(r1.nextInt(10));
        }
    }
}
