package lesson02;

public class Demo05 {
    public static void main(String[] args) {
        //获取当前线程的对象(掌握)
        /*Thread.currentThread(), 主线程也可以获取
        Thread.currentThread().setName(“我是主线程”); 设置当前线程名字
        Thread.currentThread().getClass().getName();获取线程类名*/

        Thread mainThread = Thread.currentThread();
        mainThread.setName("主线程");
        System.out.println(mainThread);
        System.out.println(mainThread.getClass());

        //开启子线程
        MyTestThread myTestThread = new MyTestThread();
        myTestThread.start();
    }
}

class MyTestThread extends Thread {
    @Override
    public void run() {
        System.out.println("任务...");
        Thread subThread = Thread.currentThread();
        System.out.println(subThread);
        System.out.println(subThread.getClass());
        System.out.println(subThread.getClass().getName());
    }
}