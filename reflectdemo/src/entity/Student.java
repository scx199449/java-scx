package entity;

//目标类
public class Student {
    private int number;
    public String name;
    protected String address;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Student() {
    }

    public void study(){
        System.out.println("在学习");
    }

    private void sleep(){
        System.out.println("睡觉");
    }
    void eat(){
        System.out.println("吃饭");
    }
    protected String saveMoney(int number){
        System.out.println("存钱");
        return "这次存了:"+number;
    }

    protected Student(String name){
       this.name = name;
    }

    private Student(int number){
       this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "entity.Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
