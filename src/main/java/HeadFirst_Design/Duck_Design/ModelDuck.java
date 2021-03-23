package HeadFirst_Design.Duck_Design;

import HeadFirst_Design.Duck_Design.Behavior.FlyNoway;
import HeadFirst_Design.Duck_Design.Behavior.MuteSquack;

public class ModelDuck extends Duck {
    @Override
    public void displayonDuck() {
        System.out.println("哎呀， 人家是一个不会飞的木头鸭子哦！");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoway();
        quackBehavior = new MuteSquack();
    }
}
