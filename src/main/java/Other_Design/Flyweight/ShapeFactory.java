package Other_Design.Flyweight;

import java.util.HashMap;

/**
 * 用来保存可以相同模式的对象
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> shapemap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) shapemap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            shapemap.put(color, circle);
            System.out.println("创造circle：color:" + color);
        }
        return circle;

    }
}
