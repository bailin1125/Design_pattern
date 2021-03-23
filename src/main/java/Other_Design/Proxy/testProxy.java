package Other_Design.Proxy;

public class testProxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("111.jpeg");
        image.display();
        System.out.println("第二次：");
        image.display();
    }
}
