import java.io.Serializable;

//汽车类实现序列化接口
public class Car implements Serializable {
    //设置serialVersionUID
    //java在进行序列化时，会将serialVersionUID和需要序列化的对象一起进行序列化
    //当反序列化时，会将被序列化的serialVersionUID与类的serialVersionUID进行对比，相同则反序列化成功，反之则失败
    //如果类中的serialVersionUID没有设置，Java会自动赋值，这个值是根据对象的属性计算出来的
    //如果先执行序列化，然后更改了属性再反序列化就会因为serialVersionUID不同而失败，所以最好自定义serialVersionUID的值
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer speed;
    transient private String OilType;//加上了transient将不会被序列化
    private static String OilNumber = "85";

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getOilType() {
        return OilType;
    }

    public void setOilType(String oilType) {
        OilType = oilType;
    }

    public static String getOilNumber() {
        return OilNumber;
    }

    public static void setOilNumber(String oilNumber) {
        OilNumber = oilNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", OilType='" + OilType + '\'' +
                '}';
    }
}
