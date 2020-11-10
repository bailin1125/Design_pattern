package Decorator.base;

public class Dog implements Animal {
    @Override
    public void function() {
        System.out.println("基本功能：吃饭+睡觉");
    }
}
