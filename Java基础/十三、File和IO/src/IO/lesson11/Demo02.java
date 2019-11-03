package IO.lesson11;

import java.io.*;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        //BufferedWriter的newLine()方法
        //newLine()换行

        //往b.txt写a.txt文件的内容【一行一行的拷贝,读一行写一行】

        //1.创建Reader
        FileReader fr = new FileReader("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson11/a.txt");
        BufferedReader br = new BufferedReader(fr);

        //2.创建Writer
        FileWriter fw = new FileWriter("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson11/b.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        //3.读一行写一行
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            /**
             * 当使用readline读取一行数据时，不会读回车换行"\r\n"字符
             */
            //bw.write("\r\n");
            bw.newLine();
        }

        //4.关流
        br.close();
        bw.close();
    }

}
