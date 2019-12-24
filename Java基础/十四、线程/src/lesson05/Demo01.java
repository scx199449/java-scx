package lesson05;

public class Demo01 {
    public static void main(String[] args) {
        //加入线程
        /*join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
        join(int), 可以等待指定的毫秒之后继续*/

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0;i<100;i++){
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
                for (int i = 0;i<100;i++){
                    System.out.println("线程B"+i);
                    if (i > 10) {
                        try {
                            //t1.join();
                            t1.join(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        //开启两个线程
        t1.start();
        t2.start();

    }
}
