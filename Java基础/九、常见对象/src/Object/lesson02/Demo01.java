package Object.lesson02;

public class Demo01 {
    public static void main(String[] args) {
    /*
    二、Object的hashCode方法
    (一)  Object有一个方法 public int hashCode（）
    (二)  方法返回对象的哈希码值，默认情况下该方法会根据对象的地址来计算
    (三)  不同对象的hashCode()一般来说不会相同，但同一个对象的hashcode值肯定是相同的
    (四)   hashCode不是对象的实际地址值，可以理解为逻辑地址值
    */
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = stu1;
        System.out.println("stu1:" + stu1.hashCode());
        System.out.println("stu2:" + stu2.hashCode());
        System.out.println("stu3:" + stu3.hashCode());
    }
}

class Student {

}