package Other_Design.Decorator;

import Other_Design.Decorator.base.Animal;


/**
 * 具体的装饰器的类的对象
 */
public class ConcreateDecorator extends Decorator {


    public ConcreateDecorator(Animal animal) {
        super(animal);
    }

    /**
     * 增强的方法
     */
    @Override
    public void function() {
        super.function();
        System.out.println("有一些附加的功能！");
        this.eat();
        this.bellow();
    }

    private void eat() {
        System.out.println("吃饭啦");
    }

    private void bellow() {
        System.out.println("吼叫一下！");
    }
}
