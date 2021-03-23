package HeadFirst_Design.Duck_Design;

import HeadFirst_Design.Duck_Design.Behavior.FlywithWings;
import HeadFirst_Design.Duck_Design.Behavior.Quack;

public class MallardDuck extends Duck {
    @Override
    public void displayonDuck() {
        System.out.println("我的外形是一只绿色的绿头鸭哦！");
    }

    public MallardDuck() {
        flyBehavior = new FlywithWings();
        quackBehavior = new Quack();
    }
}
