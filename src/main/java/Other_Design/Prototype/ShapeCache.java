package Other_Design.Prototype;

import java.util.Hashtable;

/**
 * 从数据库获取实体类并把它们保存到hash中
 */
public class ShapeCache {
    /**
     * 保存的hashtable
     */
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    /**
     * 使用id返回实体类的复制
     *
     * @param shapeId
     * @return
     */
    public static Shape getShape(String shapeId) {
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }

    /**
     * 从数据库获得数据之后存储进去
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        Rectangel rectangel = new Rectangel();
        rectangel.setId("2");
        shapeMap.put(circle.getId(), circle);
        shapeMap.put(rectangel.getId(), rectangel);
    }
}
