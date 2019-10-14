package Other.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {

    public static void main(String[] args) throws ParseException {
        String str = "2019年08月08日 02:13:31";

        //把字符串转为Date类型
        //1、创建DateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);
    }

}
