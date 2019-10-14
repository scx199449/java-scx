package Map.lesson06;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        /*案例 :HashMap集合键是Student,值是String
        键是学生对象,代表每一个学生
        值是字符串对象,代表学生归属地*/

        /*注意事项:
        1、打印的key是student的toString方法返回的字符串
        2、如果key相同，会把前面的值替换掉
        3、HashMap是无序的
        4、new出来的都不是相同的key,因为地址不同。如果属性一样，
        想替换前面对应属性一样的valus时候，需要重写equals&hashcode方法*/


        Map<Student,String> map = new HashMap<Student,String>();
        map.put(new Student("小刘",18),"湖北");
        map.put(new Student("小胡",18),"湖南");
        map.put(new Student("小官",18),"广东");
        map.put(new Student("小官",18),"福建");

        //System.out.println(map);
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry: entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

    }

}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}