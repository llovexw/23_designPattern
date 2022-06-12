package proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-16:31
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;
    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理: 买房前准备");
        Object result = method.invoke(object, args);
        System.out.println("动态代理: 买房后装修");
        return result;
    }
}