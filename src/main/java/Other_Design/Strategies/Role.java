package Other_Design.Strategies;

import Other_Design.Strategies.behavior.AttackBehavior;
import Other_Design.Strategies.behavior.RunBehavior;
import lombok.Data;

/**
 * 用来实现用户角色的超类
 */

@Data
public abstract class Role {
    protected String name;
    protected AttackBehavior attackBehavior;
    protected RunBehavior runBehavior;

    protected void attack() {
        attackBehavior.attack();
    }

    protected void run() {
        runBehavior.run();
    }


}
