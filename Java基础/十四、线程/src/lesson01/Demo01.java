package lesson01;

public class Demo01 {
    public static void main(String[] args) {
       /* JVM的启动是多线程的吗?
        1.JVM启动至少启动了垃圾回收线程和主线程，所以是多线程的。
        2.main方法执行的位置在主线程(路径)
        3.一个进程中有多个线程
        4.finalize()在子线程（垃圾回收线程）进行
        */
        System.out.println("AAAAA");
        System.out.println("BBBBB");
        System.out.println("CCCCC");
        System.out.println("DDDDD");

        //打印线程名称
        //垃圾回收和主线程打印的顺序不一样，多线程是抢占资源
        System.out.println(Thread.currentThread());//Thread.currentThread()获取当前线程

        for (int i = 0;i<2;i++){
            new Student();
            System.gc();//启动垃圾回收
        }
    }
}

class Student{
    //被垃圾回收器回收时会调用
    //对象从内存中释放时，会调用
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student 被回收了");
        //打印线程名称
        System.out.println(Thread.currentThread());
    }
}
