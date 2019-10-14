package Generic.lesson13;

import Generic.Student;

public class Demo01 {

    public static void main(String[] args) {
        /*可变参数概述
                定义方法的时候不知道该定义多少个参数
        格式
            修饰符 返回值类型 方法名(数据类型…  变量名){}
        注意事项：
            这里的变量其实是一个数组
            如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个*/

        test2(110,120,119,118);
        test3(1,"Java",new Student("小王",23));
        test4(18,"ABC","DEF",19);
    }

    public static void test1(int a,int b){

    }

    public static void test4(int a,Object ... objs){

    }

    public static void test3(Object ... objs){//objs是一个数组
        for (Object obj:objs) {
            System.out.println(obj.getClass());
        }

    }

    //可变参数
    public static void test2(int ... nums){//变量其实是一个数组

        //遍历
        for (int num : nums){
            System.out.println(num);
        }
    }

}
