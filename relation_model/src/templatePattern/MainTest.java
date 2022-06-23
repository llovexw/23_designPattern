package templatePattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-20-22:53
 */
public class MainTest {
    public static void main(String[] args) {
        Dish eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();

        System.out.println("-----------------------------");

        Dish bouilli = new Bouilli();
        bouilli.dodish();
    }

}