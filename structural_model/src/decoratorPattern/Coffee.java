package decoratorPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-15:31
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        // TODO Auto-generated method stub
        return super.getPrice();
    }
}