package List;

import java.util.ArrayList;
import java.util.List;

//集合嵌套之List嵌套List
public class Demo10 {

    public static void main(String[] args) {
        /*
        1.一个班的n学生是一个集合
        2.一个学校n班也是一个集合
        3.如何将这些数据用一个集合来表示
        */

        //1、用集合来表示两个班级
        List<Student> java1 = new ArrayList<Student>();
        java1.add(new Student("小红",22));
        java1.add(new Student("小张",22));
        java1.add(new Student("小关",22));

        List<Student> java2 = new ArrayList<Student>();
        java2.add(new Student("小李",22));
        java2.add(new Student("小陈",22));
        java2.add(new Student("小杰",22));

        //2、用集合表示学校
        List<List<Student>> school = new ArrayList<List<Student>>();
        school.add(java1);
        school.add(java2);

        //3、遍历
        //3.1 遍历班级
        for (List<Student> stus:school) {
            System.out.println("班级...");
            //遍历学生
            for (Student stu:stus) {
                System.out.println(stu);
            }
        }
    }

}
