package Other.SimpleDateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {

    public static void main(String[] args) {

        /*DateFormat类的概述
            DateFormat 是日期/时间格式化子类的抽象类，用于格式化并解析日期或时间。
            它是一个抽象类，所以使用其子类SimpleDateFormat

         SimpleDateFormat构造方法
            public SimpleDateFormat() 【这个都早方法基本不用】
            public SimpleDateFormat(String pattern)

        成员方法
            public final String format(Date date)
            public Date parse(String source)*/

        //1、获取当前日期时间
        Date date = new Date();
        System.out.println(date);

        //2、把日期的显示格式转成2018年02月02日 10:07:16
        //2.1 创建一个日期格式化对象
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        //2.2 把Date类型转成固定格式的字符串
        String str = simpleDateFormat.format(date);
        System.out.println(str);

    }

}
