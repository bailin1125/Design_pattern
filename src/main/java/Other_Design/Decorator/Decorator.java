package Other_Design.Decorator;


import Other_Design.Decorator.base.Animal;
import lombok.AllArgsConstructor;

/**
 * 抽象的装饰类角色，持有引用
 */
@AllArgsConstructor
public class Decorator implements Animal {
    private Animal animal;

    @Override
    public void function() {
        animal.function();//具体的调用委派给子类
    }
}
