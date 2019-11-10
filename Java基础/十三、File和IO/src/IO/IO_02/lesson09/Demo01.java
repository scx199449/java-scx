package IO.IO_02.lesson09;

public class Demo01 {

    public static void main(String[] args) {
        //递归
        /**
         * 递归做为一种算法,在程序设计语言中广泛应用。
         * 递归：就方法内部调用自己
         *
         * 递归的弊端:不能调用次数过多,容易导致栈内存溢出
         * 递归的好处:不用知道循环次数
         */

        //递归的注意事项
        /**
         * 构造方法是否可以递归调用?
         * 构造方法不能使用递归调用
         *
         * 递归调用是否必须有返回值?
         * 不一定(可以有,也可以没有)
         */
        //test01();

        //使用递归写阶乘
        System.out.println(jiecheng(5));

    }

    public static int jiecheng(int i) {
        if(i==1){
            return 1;
        }else{
            return i * jiecheng(i-1);
        }
    }

    //使用for循环写阶乘
    public static void test01() {
        //5！->5的阶乘，5个乘阶
        int r = 1;
        for (int i = 1;i<=5;i++){
            r *= i;
        }
        System.out.println("r = "+r);
    }

}
