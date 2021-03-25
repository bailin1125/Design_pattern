package HeadFirst_Design.XingbaZi.Decroter;

import HeadFirst_Design.XingbaZi.Beverage;
import HeadFirst_Design.XingbaZi.Condiment;

public class Whip extends Condiment {
    private Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Whip!";
    }

    @Override
    public double cost() {
        return 2.7+beverage.cost();
    }
}
