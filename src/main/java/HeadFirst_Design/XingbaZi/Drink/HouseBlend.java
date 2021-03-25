package HeadFirst_Design.XingbaZi.Drink;

import HeadFirst_Design.XingbaZi.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        this.description="HouseBlend";
    }
    @Override
    public double cost() {
        return 20.1;
    }
}
