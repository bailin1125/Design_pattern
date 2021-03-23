package Other_Design.Bridge;

/**
 * 在drawDPI抽象了不同的形状
 * 在shape抽象了不同的画法
 */
public class testBridge {
    public static void main(String[] args) {
        Shape red = new Circle(100, 20, -10, new RedCircle());
        Shape green = new Circle(200, 10, 30, new GreenCircle());
        red.draw();
        green.draw();
    }
}
