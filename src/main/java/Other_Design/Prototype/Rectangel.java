package Other_Design.Prototype;

public class Rectangel extends Shape {
    @Override
    void draw() {
        System.out.println("这是一个三角形");
    }

    public Rectangel() {
        this.setType("rectangel");
    }
}
