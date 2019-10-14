package Set.lesson10;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo02 {

    public static void main(String[] args) {
        //字符串排序（倒序）
        //Set<String> set = new TreeSet<String>();
        Set<String> set = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = o2.compareTo(o1);
                num = num == 0 ?1:num;//让同名也存在集合中
                return num;
            }
        });
        set.add("banana");
        set.add("apple");
        set.add("apple");
        set.add("orange");

        for (String fruit:set) {
            System.out.println(fruit);
        }
    }

}