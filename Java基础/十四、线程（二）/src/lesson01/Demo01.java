package lesson01;

public class Demo01 {
    public static void main(String[] args) {
        /*单例设计模式 (掌握)
        单例设计模式：保证类在内存中只有一个对象
            >1.对象是new出来的
            >2.程序中只能new一次对象
        单例模式实现方式步骤:
            1》声明一个类，类中有一个静态属性类型与类名相同
            2》把无参构造方法声明为私有
            3》在类中提供一个公共静态访问方法来返回该对象实例


        单例写法一:饿汉式
        单例写法二：懒汉式，用到时才new


        饿汉式和懒汉式的区别
            1,饿汉式是空间换时间,懒汉式是时间换空间
            2,在多线程访问时,饿汉式不会创建多个对象,而懒汉式有可能会创建多个对象
            3,如果考虑线程安全问题，用饿汉式
            4，若不考虑线程安全问题，用懒汉式
        */

        //通过单例获取类的对象
        /*Singleton s1 = Singleton.getInstance();
        System.out.println(s1);*/

        Singleton s1 = Singleton.instance;

    }
}

//方式一：饿汉式
/*class Singleton{
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}*/

//方式二：懒汉式
/*class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}*/

//方式三:最简单的
class Singleton{
    public static final Singleton instance = new Singleton();

    private Singleton() {

    }
}