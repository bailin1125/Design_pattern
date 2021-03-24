package HeadFirst_Design.Duck_Design;

import HeadFirst_Design.Duck_Design.Behavior.FlywithWings;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        /**
         * 开始测试我们设计模式的威力吧
         */
        Duck mallard = new MallardDuck();
        mallard.perfomFly();
        mallard.perfomQuack();
        mallard.displayonDuck();
        mallard.swim();

        /**
         * 第二只鸭子我们测试这个鸭子的动态改变吧
         */
        Duck model = new ModelDuck();
        model.perfomQuack();
        model.perfomFly();
        model.displayonDuck();
        model.setFlyBehavior(new FlywithWings());
        model.perfomFly();
        System.out.println("测试完成！");
    }
}
