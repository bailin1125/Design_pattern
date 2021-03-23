package Other_Design.Bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int ridus, int x, int y) {
        System.out.println("draw the green circle:ridus," + ridus + ".x:" + x + ",y:" + y);
    }
}
