package Generic.lesson09;

import Generic.Employee;
import Generic.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {
        //创建泛型集合
        List<String> list = new ArrayList<String>();

        //泛型接口
        /*泛型接口概述
                把泛型定义在接口
        定义格式
        public interface 接口名<泛型类型>*/

        //使用Dao
        StudentDao stuDao = new StudentDao();
        List<Student> studentList = stuDao.findList();
        System.out.println("studentList is :"+ studentList);

        EmployeeDao empDao = new EmployeeDao();
        List<Employee> emplist = empDao.findList();
        System.out.println("emplist is :"+ emplist);


    }

}

//获取学生信息
class StudentDao{
    /**
     * 从数据库获取学生信息
     * @return
     */
    public List<Student> findList(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("小李",23));
        list.add(new Student("小东",25));
        return list;
    }
}

//获取员工信息
class EmployeeDao{
    /**
     * 从数据库获取员工信息
     * @return
     */
    public List<Employee> findList(){
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("小红",27));
        list.add(new Employee("小张",28));
        return list;
    }
}

/*
interface A<T> {

}*/
