package Map.lesson05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        //Map集合的遍历二(键值对对象找键和值)
        //test01();

        //1、创建Map
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("zhangsan",100);
        map.put("lisi",89);
        map.put("wangwu",1000);

        //2、遍历
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry: set) {
            System.out.println(entry.getKey()+ "---" + entry.getValue());
        }

        //2.2 通过迭代器来遍历
        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "------" + entry.getValue());
        }
    }

    public static void test01() {
        //1、创建map对象
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","姚明");
        map.put("age","32");
        map.put("gender","男");

        //java.util.Map.Entry
        /**
         * Entry:成为键值对对象
         */
        Set<Map.Entry<String,String>> set = map.entrySet();
        //遍历
        for (Map.Entry<String,String> entry:set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" +value);
        }
    }

}
