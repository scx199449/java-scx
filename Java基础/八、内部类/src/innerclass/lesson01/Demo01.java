package innerclass.lesson01;
//内部类概述和访问特点
public class Demo01 {

    public static void main(String[] args) {
       /*
       内部类概述和访问特点
        (一)  内部类概述：
        就是在类内部再声明类

        (二)  内部类访问特点
        1、内部类可以直接访问外部类的成员，包括私有。
        2、外部类要访问内部类的成员，必须创建对象。

        (三)  内部类对象的创建语法
        1、外部类名.内部类名 对象名 = 外部类对象.内部类对象;
        2、开发中自己声明个内部类比较少用，用的多的就是集合中的遍历，后面讲
        */

        //创建内部类的对象
        //语法： 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
        Outer.Inner inner = new Outer().new Inner();
        inner.test2();
    }
}

class Outer {

    int a = 12;

    class Inner {
        public void test2() {
            //1、内部类可以直接访问外部类的成员，包括私有。
            System.out.println("内部类访问外部的变量a=" + a);
        }
    }
}
