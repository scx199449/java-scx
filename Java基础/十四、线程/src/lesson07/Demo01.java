package lesson07;

public class Demo01 {
    public static void main(String[] args) {
        //同步代码块和同步方法

        //案例：火车站卖票
        /**
         * 湖南到广州的火车票：今天13:00, 100张
         * 火车站有四个窗口在同时卖票，要保证一张票只能被卖一次
         *
         * 创建四个线程表示四个窗口
         *
         * 通过加锁可以解决被多次卖同一张票的问题
         *
         * 使用同步代码块
         */

        //创建售票任务
        TicketTask task = new TicketTask();

        //1号窗口
        Thread t1 = new Thread(task);
        //2号窗口
        Thread t2 = new Thread(task);
        //3号窗口
        Thread t3 = new Thread(task);
        //4号窗口
        Thread t4 = new Thread(task);

        //开启线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class TicketTask implements Runnable {

    //定义只有100张票
    int ticket = 100;

    @Override
    public void run() {
        /**
         * 同步代码块括号里的参数可以传任意对象
         * this 是一个锁对象，锁对象可以是任意类型
         * 不同的一把锁，卖相同的票问题依然存在
         */
        //卖票
        while (true) {
            synchronized (this){
                if (ticket <= 0) {
                    System.out.println("Sorry,票已售空。。。");
                    break;
                }else {
                    System.out.println(Thread.currentThread()+"售票成功，票号为："+ticket);
                    ticket--;
                }
            }
        }
    }
}
