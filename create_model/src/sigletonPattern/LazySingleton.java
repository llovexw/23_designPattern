package sigletonPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-16:16
 */
// 懒汉式, 使用该对象时再进行实例创建
public class LazySingleton {

    private static LazySingleton instance=null;

    // 其他的类无法实例化单例类的对象
    private LazySingleton(){
    };

    public static LazySingleton getInstance()
    {
        if(instance==null)
        {
            instance=new LazySingleton();
        }
        return instance;

    }
}