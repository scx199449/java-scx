package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//并发修改异常产生的原因及解决方案

/**
 * 1、ConcurrentModificationException ：并发修改异常
 * 2、默认情况下不能一边遍历一边添加元素
 * 3、如果一定要这么做，建议使用另外一个类型的迭代器ListIterator
 */
public class Demo03 {

    public static void main(String[] args) {
        //test1();
        test2();
    }

    public static void test2() {
        //并发修改异常产生的原因及解决方案
        //需求：有一个集合，判断里面有没有"word"这个元素，如果有，就添加一个"javaee"元素

        List list = new ArrayList();
        list.add("Hello");
        list.add("world");
        list.add("welcome");
        System.out.println("list :" + list);

        //遍历元素
        ListIterator li = list.listIterator();
        while (li.hasNext()){
            Object obj = li.next();
            String str = (String) obj;
            if (str.equals("world")){
                li.add("javaee");
            }
        }

        System.out.println("list :" + list);
    }

    public static void test1() {
        //并发修改异常产生的原因及解决方案
        //需求：有一个集合，判断里面有没有"word"这个元素，如果有，就添加一个"javaee"元素

        List list = new ArrayList();
        list.add("Hello");
        list.add("world");
        list.add("welcome");
        System.out.println("list :" + list);

        //遍历元素
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            String str = (String)obj;//强制类型转换
            if (str.equals("world")){
                list.add("javaee");
            }
        }

        System.out.println("list :" + list);
    }

}
