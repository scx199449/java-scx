package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//ListIterator其他方法
public class Demo04 {

    public static void main(String[] args) {

        /*boolean hasNext()       是否有下一个
        boolean hasPrevious()   是否有前一个
        Object next()           返回下一个元素
        Object previous();      返回上一个元素*/

        List list = new ArrayList();
        list.add("小胡");
        list.add("小官");
        list.add("小魏");
        list.add("小刘");
        list.add("小郭");

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

        System.out.println("===========");
        while (iterator.hasPrevious()){//判断是否有上一个元素
            Object obj = iterator.previous();
            System.out.println(obj);
        }
    }

}
