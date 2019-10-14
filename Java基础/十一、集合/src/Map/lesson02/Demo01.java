package Map.lesson02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        //Map集合的功能概述（二）
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","zhangsan");
        map.put("age",18);//int 提升为Integer
        map.put("gender",'男');//char提升为Character

        //1、获取功能
            //1、V get(Object key):根据键获取值
        System.out.println(map.get("name").getClass());
        System.out.println(map.get("age").getClass());
        System.out.println(map.get("gender").getClass());

            //2、Set<K> keySet():获取集合中所有键的集合
        Set<String> set = map.keySet();
        System.out.println(set);

            //3、Collection<V> values():获取集合中所有值的集合
        Collection<Object> collection = map.values();
        System.out.println(collection);

        //2、长度功能
        //int size()：返回集合中的键值对的个数
        int num = map.size();
        System.out.println(num);
    }

}