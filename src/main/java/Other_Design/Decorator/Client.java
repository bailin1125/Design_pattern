package Other_Design.Decorator;

import Other_Design.Decorator.base.Animal;
import Other_Design.Decorator.base.Dog;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println("装饰前:");
        animal.function();
        //然后是装饰之后呢
        Animal newanimal = new ConcreateDecorator(animal);
        newanimal.function();
    }
}
