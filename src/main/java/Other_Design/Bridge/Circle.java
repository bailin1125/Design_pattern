package Other_Design.Bridge;

public class Circle extends Shape {

    private int x, y, ridus;

    public Circle(int x, int y, int ridus, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.ridus = ridus;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(ridus, x, y);
    }
}
