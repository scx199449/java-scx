package Generic.lesson10;

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
        DaoInterface<Student> stuDao = new StudentDao();
        System.out.println("stuList:" + stuDao.findList());

        DaoInterface<Employee> empDao = new EmployeeDao();
        System.out.println("empList:" + empDao.findList());


    }

}

//发现Dao操作数据库的方法一样

/**
 * 数据访问层接口
 * 1、接口一般都定义方法
 */
interface DaoInterface<T>{
    public List<T> findList();
}

//泛型接口实现类
class StudentDao implements DaoInterface<Student>{

    @Override
    public List<Student> findList() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("小李",23));
        list.add(new Student("小东",25));
        return list;
    }
}

class EmployeeDao implements DaoInterface<Employee>{

    @Override
    public List<Employee> findList() {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("小红",27));
        list.add(new Employee("小张",28));
        return list;
    }
}

