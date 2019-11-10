package IO.IO_02.lesson05;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo03 {

    public static void main(String[] args) throws IOException {
        //案例:将文本反转
        //一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换

        //1.把文本每一行内容读出来存在List<String>集合
        //1.1集合对象
        List<String> list = new ArrayList<String>();

        //1.2读取文件
        FileReader fr = new FileReader("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_02/lesson05/b.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line = br.readLine())!=null){
            list.add(line);
        }

        //2.当我们要写入文件时，倒序保存List集合中的内容到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_02/lesson05/c.txt"));
        for (int i = list.size() -1;i >=0;i--){
            bw.write(list.get(i));
            bw.newLine();
        }

        //3.关流
        br.close();
        bw.close();

    }

}
