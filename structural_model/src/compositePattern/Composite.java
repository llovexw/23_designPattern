package compositePattern;

import java.util.ArrayList;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-17:14
 */
public class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<Component>();

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public Component getChild(int i) {
        return children.get(i);
    }

    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}