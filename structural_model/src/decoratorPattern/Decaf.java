package decoratorPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-15:42
 */
// Coffee类的实现
public class Decaf extends Coffee {
    public Decaf()
    {
        super.setDescription("Decaf");
        super.setPrice(3.0f);
    }
}