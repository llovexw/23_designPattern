package decoratorPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-15:47
 */
// coffee店：初始化一个被修饰对象，修饰者实例需要对被修改者实例化，才能对具体的被修饰者进行修饰。
public class CoffeeBar {
    public static void main(String[] args) {
        Drink order;
        order = new Decaf();
        System.out.println("order1 price:" + order.cost());
        System.out.println("order1 desc:" + order.getDescription());
        System.out.println("****************");
        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price:" + order.cost());
        System.out.println("order2 desc:" + order.getDescription());
    }
}