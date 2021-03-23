package Other_Design.Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        /**
         * 获取存储在cache中的所有数据
         */
        ShapeCache.loadCache();
        Shape cloneshape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("形状为：" + cloneshape1.getType());
        Shape cloneshape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("形状为：" + cloneshape2.getType());
    }
}
