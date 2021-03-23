package Other_Design.Bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int ridus, int x, int y) {
        System.out.println("draw the red circle,at ridus:" + ridus + ",x:" + x + ",y:" + y);
    }
}
