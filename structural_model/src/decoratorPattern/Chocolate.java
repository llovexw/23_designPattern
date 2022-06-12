package decoratorPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-15:50
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink Obj) {
        super(Obj);
        // TODO Auto-generated constructor stub
        super.setDescription("Chocolate");
        super.setPrice(1.5f);
    }
}
