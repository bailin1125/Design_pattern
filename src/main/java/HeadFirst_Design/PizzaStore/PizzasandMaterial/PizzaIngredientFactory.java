package HeadFirst_Design.PizzaStore.PizzasandMaterial;

import HeadFirst_Design.PizzaStore.PizzasandMaterial.*;

/**
 * 实现创造原材料的接口
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepproni createPepproni();
    public Clams createClams();
}
