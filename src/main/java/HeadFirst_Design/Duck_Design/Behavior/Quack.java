package HeadFirst_Design.Duck_Design.Behavior;

public class Quack implements QuackBehavior {
    @Override
    public void perfomQuack() {
        System.out.println("这里我是呱呱呱的叫");
    }
}
