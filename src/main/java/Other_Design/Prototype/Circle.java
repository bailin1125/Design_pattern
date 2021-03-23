package Other_Design.Prototype;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("这是一个圆形！");
    }

    public Circle() {
        this.setType("circle");
    }
}
