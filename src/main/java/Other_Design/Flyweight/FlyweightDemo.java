package Other_Design.Flyweight;

/**
 * 通过输入的工厂产生一系列的对象
 */
public class FlyweightDemo {
    private static final String colors[] = {"red", "green", "black", "grey"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomx());
            circle.setY(getRandomy());
            circle.setRidus(100);
            circle.draw();
        }
    }

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static int getRandomx() {
        return (int) (Math.random() * 100);
    }

    public static int getRandomy() {
        return (int) (Math.random() * 100);
    }

}
