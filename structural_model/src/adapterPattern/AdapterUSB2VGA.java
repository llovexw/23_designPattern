package adapterPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-12-15:17
 */
public class AdapterUSB2VGA extends USBImpl implements VGA {
    @Override
    public void projection() {
        super.showPPT();
    }
}