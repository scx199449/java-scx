package test_config;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

//Java反射demo5，通过反射机制运行配置文件内容
/*
 * 我们利用反射和配置文件，可以使：应用程序更新时，对源码无需进行任何修改
 * 我们只需要将新类发送给客户端，并修改配置文件即可
 */
public class ReflectTest05 {
    public static void main(String[] args) throws Exception {
        //通过反射获取class对象
        Class action = Class.forName(getValue("className"));
        //获取方法
        Method m = action.getMethod(getValue("methodName"));
        //调用方法
        m.invoke(action.getConstructor().newInstance());
    }

    public static String getValue(String key) throws IOException {
        //获取配置文件对象
        Properties properties = new Properties();
        //获取文件输入流
        FileReader in = new FileReader("pro.txt");
        //将流加入到配置文件的对象中
        properties.load(in);
        in.close();
        return properties.getProperty(key);
    }
}
