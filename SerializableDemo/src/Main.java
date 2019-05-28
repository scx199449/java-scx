import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Car car1 = new Car();
        car1.setName("莱肯");
        car1.setSpeed(350);
        car1.setOilType("汽油");//因为加上了transient，所以不会被序列化
        serializableCar(car1);
        Car car2 = deserializableCar();
        System.out.println(car2.toString());
    }

    /**
     * 汽车类对象序列化
     */
    public static void serializableCar(Car car) throws IOException {
        // ObjectOutputStream 对象输出流，将 Car 对象存储到E盘的 Car.txt 文件中，完成对 Car 对象的序列化操作
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:/工作demo/Car.txt")));
        oos.writeObject(car);
        System.out.println("序列化成功");
        oos.close();
    }

    /**
     *汽车类对象反序列化
     * @return
     */
    public static Car deserializableCar() throws Exception {
        ObjectInputStream ooi = new ObjectInputStream(new FileInputStream(new File("D:/工作demo/Car.txt")));
        Car car = (Car) ooi.readObject();
        System.out.println("反序列化成功");
        return car;
    }
}
