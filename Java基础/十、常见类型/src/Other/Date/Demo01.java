package Other.Date;

import java.util.Date;

public class Demo01 {

    public static void main(String[] args) {
       /* Date类的概述
            类 Date 表示特定的时间，精确到毫秒。
        构造方法
            public Date()
            public Date(long date)
        成员方法
            public long getTime()
            public void setTime(long time)*/
        //test1();

        long time = 1565200727220L;

        //把毫秒还原成日期-时分秒
        //第一种写法
        //Date date = new Date(time);

        //第二种写法
        Date date = new Date();
        date.setTime(time);
        System.out.println(date);

    }

    public static void test1() {
        //获取当前时间
        /**
         * 时间格式
         * Thu Aug 08 01:55:40 CST 2019
         * 星期 月  日  时间    时区 年
         */
        Date date = new Date();
        System.out.println(date);


        long time = date.getTime();
        System.out.println("自1970.1.1 0:0:0到现在走过的毫秒数"+time);
    }

}
