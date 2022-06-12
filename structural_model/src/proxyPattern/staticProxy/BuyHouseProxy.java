package proxyPattern.staticProxy;

import proxyPattern.util.BuyHouse;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-16:21
 */
public class BuyHouseProxy implements BuyHouse {
    private BuyHouse buyHouse;
    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }
    @Override
    public void buyHosue() {
        System.out.println("买房前准备");
        buyHouse.buyHosue();
        System.out.println("买房后装修");
    }
}