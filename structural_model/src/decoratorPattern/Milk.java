package decoratorPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-15:46
 */
public class Milk extends Decorator {
    public Milk(Drink Obj) {
        super(Obj);
        // TODO Auto-generated constructor stub
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }
}
