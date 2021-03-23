package HeadFirst_Design.Duck_Design.Behavior;

public class MuteSquack implements QuackBehavior {
    @Override
    public void perfomQuack() {
        System.out.println("我不是有生命的鸭子，所以不会叫！");
    }
}
