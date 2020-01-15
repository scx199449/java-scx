package lesson03;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo01 {
    public static void main(String[] args) {
        //Timer（计时器,定时器）
        /*一种工具，用于在后台线程中执行的任务。可安排任务执行一次，或者定期重复执行。
        方法
        public void schedule(TimerTask task, long delay)
        public void schedule(TimerTask task, long delay, long period)
        //指定时间执行任务
        public void schedule(TimerTask task, Date firstTime, long period)*/
    }

    public static void test03() {
        /**
         * 定时器是在子线程中执行
         * timer.cancel(); 取消定时器
         */

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int count = 5;
            @Override
            public void run() {
                System.out.println("任务A:"+count+"..."+Thread.currentThread());
                count--;
                if (count == 0) {
                    timer.cancel();
                }
            }
        }, 1000,2000);

        //timer.cancel();//主线程执行
    }

    public static void test02() {
        //3秒后执行任务，没隔2秒重复执行任务
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务A...."+new Date());
            }
        }, 3000, 2000);
    }

    public static void test01() {
        //1.创建定时器
        Timer timer = new Timer();

        //2.执行任务
        /*
        1、3秒后执行任务
        2、任务完成后，程序不退出
        */
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务A");
            }
        }, 3000);
    }
}
