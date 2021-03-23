package Other_Design.Flyweight;

import lombok.Data;

@Data
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private double ridus;

    @Override
    public void draw() {
        System.out.println("Circle draw :color:" + color + ",x:" + x + ",y:" + y + ",ridus:" + ridus);
    }

    public Circle(String color) {
        this.setColor(color);
    }
}
