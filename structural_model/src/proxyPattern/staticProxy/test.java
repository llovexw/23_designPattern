package proxyPattern.staticProxy;

import proxyPattern.util.BuyHouse;
import proxyPattern.util.BuyHouseImpl;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-16:25
 */
public class test {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        // 通过中介代理调用方法
        new BuyHouseProxy(buyHouse).buyHosue();
    }
}
