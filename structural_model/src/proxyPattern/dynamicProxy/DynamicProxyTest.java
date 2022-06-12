package proxyPattern.dynamicProxy;

import proxyPattern.util.BuyHouse;
import proxyPattern.util.BuyHouseImpl;

import java.lang.reflect.Proxy;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-16:31
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
                                                                    new Class[]{BuyHouse.class},
                                                                    new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHosue();
    }
}