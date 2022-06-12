package adapterPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-15:20
 */
public class test {
    public static void main(String[] args) {
        //通过适配器创建一个VGA对象，这个适配器实际是使用的是USB的showPPT（）方法
        VGA a=new AdapterUSB2VGA();
        //进行投影
        Projector p1=new Projector();
        p1.projection(a);
    }
}
