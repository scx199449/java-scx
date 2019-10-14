package List;

import java.util.Arrays;
import java.util.List;

public class Demo09 {

    public static void main(String[] args) {
        //Arrays工具类的asList()方法的使用

        //把参数转成集合
        List<String> list = Arrays.asList("java","Golang","Python");
        System.out.println(list);

        List<Student> list1 = Arrays.asList(new Student("小王",22),new Student("小李",22));
        System.out.println(list1);
    }

}
