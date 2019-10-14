package collection;

import java.util.ArrayList;
import java.util.Collection;

//Collection
public class Demo01 {
    public static void main(String[] args) {

        //Collection集合的基本功能
        /*boolean add(E e) 添加元素
        boolean remove(Object o)  移除元素
        void clear() 清除所有元素
        boolean contains(Object o) 是否包含
        boolean isEmpty() 是否为空
        int size()  数组长度
        */

        //创建一个集合对象
        Collection coll = new ArrayList();//接口指向实现类

        coll.add("Java");
        coll.add("PHP");
        coll.add("Python");
        System.out.println(coll);

        //移除元素
        coll.remove("PHP");
        System.out.println(coll);

        //清除所有元素
        /*coll.clear();
        System.out.println(coll);*/

        //包含元素
        System.out.println(coll.contains("Java"));

        //是否为空
        System.out.println(coll.isEmpty());

        //返回数组长度
        System.out.println(coll.size());

    }
}
