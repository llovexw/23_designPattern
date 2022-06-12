package compositePattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-17:13
 */
public interface Component {
    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();
}