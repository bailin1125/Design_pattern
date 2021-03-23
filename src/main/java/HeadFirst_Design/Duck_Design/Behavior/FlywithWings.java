package HeadFirst_Design.Duck_Design.Behavior;

public class FlywithWings implements FlyBehavior {

    @Override
    public void perfomFly() {
        System.out.println("这里我具体是通过翅膀飞起来的！");
    }
}
