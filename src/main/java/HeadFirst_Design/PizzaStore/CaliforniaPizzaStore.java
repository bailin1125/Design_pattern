package HeadFirst_Design.PizzaStore;

import HeadFirst_Design.PizzaStore.PizzasandMaterial.ChessePizza;
import HeadFirst_Design.PizzaStore.PizzasandMaterial.Pizza;
import HeadFirst_Design.PizzaStore.PizzasandMaterial.VeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore{


    /**
     * 把创造具体披萨的方法委托给子类来做
     * @param type
     * @return
     */
    @Override
    public Pizza createPizza(String type) {
        Pizza res=null;
        if(type.equals("chesse")){
            res=new ChessePizza();
            System.out.println("加州风味的起司");
        }
        else if(type.equals("Veggie")){
            res=new VeggiePizza();
            System.out.println("加州风味的Veggie");
        }
        return res;
    }
}
