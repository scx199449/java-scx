package Map.lesson01;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {

    public static void main(String[] args) {
        //Map集合的功能概述（一）

        //1、创建一个Map对象,一般使用HashMap这个子类
        Map<String,String> map = new HashMap<String,String>();

        //2、添加功能
        //V put(K key,V value):添加元素。
        //如果键是第一次存储，就直接存储元素，返回null
        //如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
        String value = map.put("name","zhangsan");
        System.out.println(value);

        value = map.put("name","lisi");
        System.out.println(value);

        map.put("age","30");
        map.put("gender","男");
        System.out.println("map:"+map);

        //3、删除功能
            //1、void clear():移除所有的键值对元素
            //2、V remove(Object key)：根据键删除键值对元素，并把值返回
        map.clear();
        /*String gender = map.remove("gender");
        System.out.println(gender);
        System.out.println("map:"+map);*/

        //4、 判断功能
            //1、boolean containsKey(Object key)：判断集合是否包含指定的键
            //2、boolean containsValue(Object value):判断集合是否包含指定的值
            //3、boolean isEmpty()：判断集合是否为空
        System.out.println(map.containsKey("name"));
        System.out.println(map.containsValue("lisi"));
        System.out.println(map.isEmpty());

    }

}
