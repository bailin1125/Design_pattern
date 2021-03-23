package Other_Design.Bridge;

/**
 * drawapi抽象了不同的形状
 * shape需要抽象的不同的画法
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
