package HeadFirst_Design.XingbaZi.Decroter;

import HeadFirst_Design.XingbaZi.Beverage;
import HeadFirst_Design.XingbaZi.Condiment;

public class Mocha extends Condiment {
    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Mocha!";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.20;
    }
}
