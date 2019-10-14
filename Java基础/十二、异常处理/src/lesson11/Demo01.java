package lesson11;

public class Demo01 {

    public static void main(String[] args) {
        //面试题：
        /*1.final,finally和finalize的区别
        final可以修饰类,不能被继承;修饰方法,不能被重写;修饰变量,只能赋值一次
        finally是try语句中的一个语句体,不能单独使用,用来释放资源
        finalize是一个方法,当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。*/

        for (int i = 0;i < 10;i++){
            new Person();
            System.gc();//垃圾回收
        }

    }

}

class Person {
    //当对象从内存中消失时会调用
    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象从内存中释放");
    }
}
