package Set.lesson02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        /**
         * HashSet
         * 1、此类实现Set接口
         * 2、由哈希表（实际为HashMap实例）支持
         * 3、对集合的迭代次序不作任何保证; 特别是，它不能保证订单在一段时间内保持不变
         * 4、这个类允许null元素
         *
         * 面试：你在开发中经常使用Java的哪些包？
         * 1、java.util包，这个包有很多集合框架：List/Set/Map
         *
         */

        //Set遍历一、增强for循环
        //Set遍历二、迭代器
        Set<String> set = new HashSet<String>();
        set.add("大巴");
        set.add("火车");
        set.add("高铁");
        set.add("飞机");
        set.add(null);//一般null没有实际意义

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }

}
