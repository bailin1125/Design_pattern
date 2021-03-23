package Other_Design.Proxy;

/**
 * 代理类，外观上访问的类
 */
public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }

    public ProxyImage(String filename) {
        this.filename = filename;
    }
}
