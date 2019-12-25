package lesson06;

public class Demo01 {
    public static void main(String[] args) {
        /*线程的优先级
        1.setPriority()设置线程的优先级
        2.线程优先级1~10
        3.每个线程都有默认优先级5
        4.优先级大的线程，任务会先执行完成
        */

        //创建两个线程
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    System.out.println("线程A"+i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    System.out.println("线程B"+i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        //设置优先级
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        //开启线程
        t1.start();
        t2.start();

    }

    public static void Test01() {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                //打印线程对象
                /**
                 *
                 * Thread[Thread-0,5,main]
                 * Thread-0:线程名称
                 * 5：优先级
                 * main：线程组
                 */
                System.out.println(Thread.currentThread());
            }
        };

        /**
         * Thread.MIN_PRIORITY 1 最小优先级
         * Thread.NORM_PRIORITY 5 默认优先级
         * Thread.MAX_PRIORITY 10 最大优先级
         */
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }
}
