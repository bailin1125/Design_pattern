package HeadFirst_Design.Duck_Design;

import HeadFirst_Design.Duck_Design.Behavior.FlyBehavior;
import HeadFirst_Design.Duck_Design.Behavior.QuackBehavior;

/**
 * 鸭子的基类，抽象出不怎么变的部分
 */
public abstract class Duck {

    /**
     * 模型中容易变的部分是两个具体的行为
     */
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
        System.out.println("我是一只小鸭子");
    }

    public abstract void displayonDuck();

    public void perfomQuack() {
        quackBehavior.perfomQuack();
    }

    public void perfomFly() {
        flyBehavior.perfomFly();
    }

    /**
     * 可能不太会变的部分放在这里来
     */
    public void swim() {
        System.out.println("我正在游泳哦！");
    }

    /**
     * 为了更好的实现动态性，这里我们加入两个方法来设定行为
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
