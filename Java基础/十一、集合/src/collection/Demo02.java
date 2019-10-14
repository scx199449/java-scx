package collection;

import java.util.ArrayList;
import java.util.Collection;

//集合的遍历
public class Demo02 {

    public static void main(String[] args) {

        //把集合转成数组,方法一: 把集合转为数组

        //1、创建集合对象
        Collection coll = new ArrayList();

        //2、添加元素
        coll.add("apple");
        coll.add("banana");
        coll.add("orange");

        //3、集合的遍历(集合转数组遍历)
        Object[] objs = coll.toArray();
        for (int i = 0;i < objs.length;i++){
            Object o = objs[i];
            System.out.println(o);
        }
    }

}
