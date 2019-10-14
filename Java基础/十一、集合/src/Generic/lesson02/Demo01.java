package Generic.lesson02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo01 {

    public static void main(String[] args) {
        //泛型集合
        //1、声明一个泛型集合
        List<String> list = new ArrayList<String>();

        list.add("abc");
        list.add("abc");
        list.add("def");

        //遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            //取元素
            String str = iterator.next();
            System.out.println(str);
        }
    }

}
