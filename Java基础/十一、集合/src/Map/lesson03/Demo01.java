package Map.lesson03;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {

    public static void main(String[] args) {
//        HashMap使用注意事项
//            声明HashMap时的键值可以是任意对象
        Map<String,String> map1 = new HashMap<String,String>();
        Map<Integer,String> map2 = new HashMap<Integer, String>();
        Map<String,Integer> map3 = new HashMap<String,Integer>();
        Map<String,Object> map4 = new HashMap<String,Object>();

//            如果有重复的键，会把以前的替换
        map1.put("name","zhangsan");
        map1.put("name","lisi");
        System.out.println(map1);

//            值能为空
        map1.put("age",null);
        System.out.println(map1);

//            键能为空,但这样写没什么意义
        map1.put(null,"XXX");
        System.out.println(map1);

//            put方法的返回值
//            如果键是第一次存储，就直接存储元素，返回null
//            如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值

    }

}
