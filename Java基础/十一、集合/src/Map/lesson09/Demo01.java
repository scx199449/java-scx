package Map.lesson09;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {

    public static void main(String[] args) {
        //案例：统计字符串中每个字符出现的次数
        String str = "aaaabbbcccccccccc";

        /**
         * Map<Charactor,Integer> map = new HashMap<Charactor,Integer>();
         * map.put('a',4);
         * map.put('b',3);
         * map.put('c',10);
         */

        //1、创建存储字符次数的Map集合
        Map<Character,Integer> map = new HashMap<Character, Integer>();

        //2、遍历字符串的每一个字符
        for (int i = 0; i < str.length(); i++) {
            //3、往map里添加字符出现的次数（累加）
            char ch = str.charAt(i);
            //第一次出现这个字符
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                //如果不是第一次出现这个字符，累加
                map.put(ch,map.get(ch)+1);
            }
        }

        System.out.println(map);
    }

}
