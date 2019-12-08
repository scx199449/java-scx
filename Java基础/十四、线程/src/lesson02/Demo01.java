package lesson02;

public class Demo01 {
    public static void main(String[] args) {
        //线程实现的方式 (1) - 继承Thread
        /*
        使用步骤:
          1.定义类继承Thread
          2.重写run方法
          3.把新线程要做的事写在run方法中
          4.创建线程对象
          5.开启新线程, 内部会自动执行run方法
        注:这种方式只能调用start,内部会调用run方法
        */

        //使用子线程
        /**
         * 主线程，程序员不能创建
         */
        //1.创建子线程对象
        MyThread t1 = new MyThread();
        /*不能通过t1.run的方式来执行任务，因为这种方式任务是在主线程执行*/
        //2.正确方法，调用start，内部会开启新线程，调用run方法
        t1.start();

        //3.再创建一个子线程
        MyThread t2 = new MyThread();
        t2.start();

        //5.循环创建子线程
        for (int i=0;i<10;i++){
            MyThread th = new MyThread();
            th.start();
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("银行信用卡还款短信任务..."+Thread.currentThread());
    }
}