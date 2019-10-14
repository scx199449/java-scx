package lesson08;

public class Demo01 {

    public static void main(String[] args) throws Exception {
        //throws的方式处理异常
        /**
         * 自己处理异常：
         * 1、try-catch
         * 2、try-catch-catch(多个catch)
         * 3、throws
         *
         *
         * 实现方式：
         * 1、定义功能方法时，需要把出现的问题暴露出来让调用者去处理。
         *      调用者可以try-catch来处理
         * 2、那么就通过throws在方法上标识。
         */

        Person p = new Person();
        p.setAge(-18);
        try {
            p.setAge(-18);
        }catch (Exception e) {
            e.printStackTrace();
        }

        p.say();
    }

}

class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        //年龄1-150内
        if(age >= 1 && age <= 150){
            this.age = age;
        }else{
            throw new Exception("你来自火星");
        }
    }

    public void say(){
        System.out.println("我今年"+age+"岁");
    }
}
