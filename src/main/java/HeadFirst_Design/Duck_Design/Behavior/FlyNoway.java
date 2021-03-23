package HeadFirst_Design.Duck_Design.Behavior;


public class FlyNoway implements FlyBehavior {

    @Override
    public void perfomFly() {
        System.out.println("放弃吧， 怎么飞你都飞不起来的！");
    }
}