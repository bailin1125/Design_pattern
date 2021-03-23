package Other_Design.Prototype;

import lombok.Data;

/**
 * 所谓原型模式，就是为了减少同类对象的创建，使用clone来返回对象拷贝
 * 一般是用于创建对象代价比较高的时候
 */
@Data
public abstract class Shape implements Cloneable {
    private String type;
    private String id;

    abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
