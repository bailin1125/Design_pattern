package HeadFirst_Design.PizzaStore;

import HeadFirst_Design.PizzaStore.PizzasandMaterial.ChessePizza;
import HeadFirst_Design.PizzaStore.PizzasandMaterial.Pizza;
import HeadFirst_Design.PizzaStore.PizzasandMaterial.VeggiePizza;

/**
 * 创建pizza的工厂类
 * 这里只是一个普通工厂，没有采用静态工厂
 * 采用静态工厂的问题：不能通过继承改变创建对象的行为
 */
public class PizzaFactory {
    /**
     * 创建pizza的方法
     * @param type
     * @return
     */
    public static final Pizza creatPizza(String type){
        Pizza res=null;
        if(type.equals("chesse")){
            res=new ChessePizza();
        }
        else if(type.equals("Veggie")){
            res=new VeggiePizza();
        }
        return res;
    }
}
