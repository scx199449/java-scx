package lesson02;

public class Demo03 {

    public static void main(String[] args) {
        //匿名内部类实现线程的两种方式
        /**
         * 实现线程方式：
         * 1、继承Thread
         * 2、实现Runnable接口
         */
        //Test01();
        Test02();

    }

    //实现Runnable接口
    public static void Test02() {
    /*Thread t2 = new Thread(new Runnable(){

        @Override
        public void run() {
            System.out.println("任务2："+Thread.currentThread());
        }
    });
    t2.start();*/
        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("任务2："+Thread.currentThread());
            }
        }).start();
    }

    //继承Thread
    public static void Test01() {
    /*Thread t1 = new Thread(){
        @Override
        public void run() {
            System.out.println("任务1:"+Thread.currentThread());
        }
    };

    t1.start();*/

        new Thread(){
            @Override
            public void run() {
                System.out.println("任务1："+Thread.currentThread());
            }
        }.start();
    }

}

