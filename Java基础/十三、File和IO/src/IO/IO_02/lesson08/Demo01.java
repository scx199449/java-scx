package IO.IO_02.lesson08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //练习:获取文本上字符出现的次数,把数据写入文件
        //E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson08/a.txt"
        /*
        思路:
        1.便利文本每一个字符
        2.字符出现的次数存在map中
        *//**
         * Map<Character,Integer> map = new HashMap<Character,Integer>();
         *//*
        3.把map中的数据写入文件*/

        //1.创建map集合
        Map<Character,Integer> map = new HashMap<Character, Integer>();

        //2.遍历每一个字符,把每一个字符出现的次数放到map中
        FileReader fileReader = new FileReader("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson08/a.txt");
        int c = 0;
        while ((c = fileReader.read()) != -1){
            //int 还原char
            char ch = (char)c;
            //判断这个char是否在map中第一次出现
            if(map.get(ch) == null){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
        System.out.println(map);

        //3.把map中的数据存入文件count.txt
        //3.1 创建Writer
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_02/lesson08/count.txt"));
        //3.2 遍历map，再写入数据

        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            bw.write(entry.getKey() + "=" +entry.getValue()); //写入字符出出现的次数
            bw.newLine();
        }

        //4.关流
        fileReader.close();
        bw.close();
    }

}
