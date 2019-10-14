package Map.lesson04;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {

    public static void main(String[] args) {
        //Map集合的遍历一(键找值)
        //1、创建map对象
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","姚明");
        map.put("age","32");
        map.put("gender","男");

        //2、取key对应的值
        for (String str:map.keySet()) {
            System.out.println(map.get(str));
        }
    }

}
