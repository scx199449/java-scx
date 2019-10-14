package Map.lesson07;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        //LinkedHashMap的概述和使用
        /*LinkedHashMap的特点：底层是链表实现的可以保证怎么存就怎么取
        HashMap是存的和取的顺序是不一样的*/

        //Map<String,String> map = new HashMap<String,String>();
        Map<String,String> map = new LinkedHashMap<String, String>();
        map.put("zhangsan","广州");
        map.put("lisi","广西");
        map.put("王五","湖南");
        map.put("zhaoliu","湖北");
        map.put("xiaoqi","湖南");

        //遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:entries) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        for (Map.Entry<String, String> entry:map.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }

}
