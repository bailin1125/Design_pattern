package HeadFirst_Design.XingbaZi.Decroter;

import HeadFirst_Design.XingbaZi.Beverage;
import HeadFirst_Design.XingbaZi.Condiment;

public class Soy extends Condiment {
    private Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Soy!";
    }

    @Override
    public double cost() {
        return 1.9+beverage.cost();
    }
}
