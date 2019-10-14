package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo05 {

    public static void main(String[] args) {
        //Collection中toArray(T[] a)泛型版的集合转数组
        Collection<String> col = new ArrayList<String>();
        col.add("Java");
        col.add("Python");

        String[] strs = new String[2];
        //把集合里的元素存在指定数组
        col.toArray(strs);

        for (String str: strs) {
            System.out.println(str);
        }
    }

}
