package sigletonPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-16:18
 */
public class Singleton {
    // volatile是为了防止指令重排
    private static volatile Singleton instance = null;
    private Singleton() {
    };
    // 两次判断，第一次判断是为了防止多次进行加锁操作，第二次判断是为了防止重复创建对象
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
