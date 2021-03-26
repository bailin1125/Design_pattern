package HeadFirst_Design.PizzaStore;

import HeadFirst_Design.PizzaStore.PizzasandMaterial.Pizza;

/**
 * 执行测试pizza的方法
 * 工厂模式和简单工厂模式
 */
public class TestPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore= new NYPizzaStore();
        PizzaStore pizzaStore1=new ChiggoPizzaStore();
        Pizza one=pizzaStore.orderPizza("chesse");
        Pizza two=pizzaStore1.orderPizza("chesse");
    }

}
