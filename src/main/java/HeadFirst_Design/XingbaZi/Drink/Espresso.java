package HeadFirst_Design.XingbaZi.Drink;

import HeadFirst_Design.XingbaZi.Beverage;

/**
 * 具体的浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso(){
        this.description="Expresso";
    }
    @Override
    public double cost() {
        return 9.9;
    }
}
