package Map.lesson11;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo01 {

    public static void main(String[] args) {
        //面试题:HashMap和Hashtable的区别
       /* 1、Hashtable是JDK1.0版本出现的,是线程安全的,效率低,有加锁(看原码)
          2、HashMap是JDK1.2版本出现的,是线程不安全的,效率高
          3、Hashtable不可以存储null键和null值
          4、HashMap可以存储null键和null值*/

       //hashmap对象
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("name","scx");
        map.put(null,null);
        System.out.println(map);

       //hashtable对象
        Hashtable<String,String> table = new Hashtable<String,String>();
        table.put("name","scx");
        //table.put(null,null);
        System.out.println(table);
    }

}
