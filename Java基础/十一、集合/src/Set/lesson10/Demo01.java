package Set.lesson10;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet的排序方式有2种
 * 1、自然排序（comparable）
 * 2、比较器排序（Comparator）
 *          如果元素类型是final类型，不能被重写，这个时候选择Comparator
 */
public class Demo01 {

    public static void main(String[] args) {
        //TreeSet:可以用于排序
        //1、存Integer，或者String，这两个已经实现了comparable接口
        //2、如果是自定义对象，如Student，那这个学生要自己实现comparable接口

        //Set<Integer> set = new TreeSet<Integer>();//无参构造
        Set<Integer> set = new TreeSet<Integer>(new MyComparator());

        set.add(23);
        set.add(13);
        set.add(2);
        set.add(8);

        for (Integer i:set) {
            System.out.println(i);
        }
    }

}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}