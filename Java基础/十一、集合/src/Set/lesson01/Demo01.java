package Set.lesson01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        /**
         * Set:接口
         * 1、不包含重复元素的集合
         * 2、并且最多一个空元素
         * 3、一般使用它的实现类：HashSet、LinkedHashSet、TreeSet
         * 4、Set集合存和取的顺序不一样,每一次取的顺序都可能不一样
         *
         * List:接口
         * 1、List是可存储相同元素
         * 2、List存取的元素是一样的
         */

        //一、List接口
        List<String> list = new ArrayList<String>();
        list.add("春节");
        list.add("五一");
        list.add("国庆");
        list.add("春节");
        /*list.add(null);
        list.add(null);*/
        System.out.println("list:" + list);

        //遍历
        for (String str:list) {
            System.out.println(str);
        }


        //二、Set接口
        Set<String> set = new HashSet<String>();
        set.add("单车");
        set.add("摩托");
        set.add("轿车");
        set.add("轿车");
        set.add(null);//空元素
        set.add(null);//空元素
        System.out.println("set:"+set);

        //遍历Set
        for (String str:set) {
            System.out.println(str);
        }
    }

}
