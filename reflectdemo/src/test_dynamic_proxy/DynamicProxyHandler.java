package test_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理对象处理器
public class DynamicProxyHandler implements InvocationHandler {
    private Object proxyed;

    public DynamicProxyHandler(Object proxyed) {
        this.proxyed = proxyed;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理工作了.");
        return method.invoke(proxyed, args);
    }
}
