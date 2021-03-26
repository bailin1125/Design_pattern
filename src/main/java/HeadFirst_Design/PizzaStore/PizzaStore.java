package HeadFirst_Design.PizzaStore;

import HeadFirst_Design.PizzaStore.PizzasandMaterial.Pizza;

public abstract class PizzaStore {
    private PizzaFactory pizzaFactory;
/**
 * 现在就不要绑定一个构造函数了
 */
//    public PizzaStore(PizzaFactory pizzaFactory){
//        this.pizzaFactory=pizzaFactory;
//    }

    /**
     * 预订披萨的方法，不用知晓具体生成了什么披萨，直接就去做后面的工序
     * @param type
     * @return
     */
    public Pizza orderPizza(String type){
        Pizza pizza=null;
        //pizza=pizzaFactory.creatPizza(type);
        pizza=createPizza(type);
        assert pizza!=null;
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("做好披萨了哦");
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
