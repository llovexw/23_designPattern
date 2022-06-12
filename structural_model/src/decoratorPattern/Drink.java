package decoratorPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-15:29
 */
public abstract class Drink {
    public String description="";
    private float price=0f;;


    public void setDescription(String description)
    {
        this.description=description;
    }

    public String getDescription()
    {
        return description+"-"+this.getPrice();
    }
    public float getPrice()
    {
        return price;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }

    public abstract float cost();

}
