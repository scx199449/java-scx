package Set.lesson05;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet:
 *  1、TreeSet是一个可以用于排序的集合
 *  2、TreeSet:基于 TreeMap 的 NavigableSet 实现。
 *  3、TreeSet的排序方法有两种
 *      使用元素的自然顺序Comparable对元素进行排序
 *      使用构造方法的 Comparator 进行排序
 *
 *
 * TreeSet存储数字，会自然排序(由小到大)
 * TreeSet存储字符串，会自然排序(字母由小到大)
 */
public class Demo01 {

    public static void main(String[] args) {
        //TreeSet存储Integer类型的元素并遍历
        //Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new TreeSet<Integer>();
        set1.add(18);
        set1.add(12);
        set1.add(22);
        set1.add(21);
        set1.add(32);

        for (Integer i: set1) {
            System.out.println(i);
        }

        System.out.println("-------------");
        Set<String> set2 = new TreeSet<String>();
        set2.add("lucy");
        set2.add("tony");
        set2.add("abc");
        set2.add("Amy");
        set2.add("CC");
        set2.add("Banana");

        //遍历
        for (String name:set2) {
            System.out.println(name);
        }
    }

}
