package sigletonPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-16:15
 */
// 饿汉式, 创建实例即加载对象, 造成内存空间浪费
public class PreloadSingleton {

    public static PreloadSingleton instance = new PreloadSingleton();

    //其他的类无法实例化单例类的对象
    private PreloadSingleton() {
    };

    public static PreloadSingleton getInstance() {
        return instance;
    }
}
