package lesson12;

/**
 * 自定义异常的步骤：
 * 1、写一个类继承Exception,这种是编译异常
 * 2、在子类异常中提供一个带字符串参数的构造方法
 * 3、自定义异常时，也可以继承RuntimeException,这种是运行时异常
 */
public class Demo01 {

    public static void main(String[] args) {
        //自定义异常概述和基本使用
        /**
         * 1、自定义一个年龄异常AgeException
         */

        Person p = new Person();
        /*try {
            p.setAge(180);
        } catch (AgeException e) {
            e.printStackTrace();
        }*/
        p.setAge(180);
        p.say();
    }
}

class Person {
    private int age;

    /**
     * age 在1-150范围
     * 在方法里抛出异常
     * @param age
     */
    public void setAge(int age) throws AgeException{
        if (age >= 1 && age <= 150) {
            this.age = age;
        }else{
            throw new AgeException("年龄超出实际范围");
        }

    }

    public void say() {
        System.out.println("今年："+this.age+"岁");
    }
}

//编译异常
/*class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}*/

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
