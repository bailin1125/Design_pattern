package HeadFirst_Design.PizzaStore;

import HeadFirst_Design.PizzaStore.PizzasandMaterial.NystyleChessePizza;
import HeadFirst_Design.PizzaStore.PizzasandMaterial.Pizza;
import HeadFirst_Design.PizzaStore.PizzasandMaterial.VeggiePizza;

public class NYPizzaStore extends PizzaStore{


    /**
     * 把创造具体披萨的方法委托给子类来做
     * @param type
     * @return
     */
    @Override
    public Pizza createPizza(String type) {
        Pizza res=null;
        if(type.equals("chesse")){
            res=new NystyleChessePizza();
            System.out.println("纽约风味的起司");
        }
        else if(type.equals("Veggie")){
            res=new VeggiePizza();
            System.out.println("纽约风味的Veggie");
        }
        return res;
    }
}
