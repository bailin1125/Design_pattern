package Strategies;

import Strategies.behavior.AttackNiubi;
import Strategies.behavior.RunNiubie;

public class Test {
    public static void main(String[] args) {
        //开始进行方法的测试
        RoleTypeA roleTypeA = new RoleTypeA("小龙女");
        roleTypeA.setAttackBehavior(new AttackNiubi());
        roleTypeA.setRunBehavior(new RunNiubie());
        System.out.println("role:" + roleTypeA.getName());
        roleTypeA.attack();
        roleTypeA.run();
    }
}
