package HeadFirst_Design.XingbaZi.Drink;

import HeadFirst_Design.XingbaZi.Beverage;
import HeadFirst_Design.XingbaZi.SIZE;

public class HouseBlend extends Beverage {
    public HouseBlend(SIZE size){
        this.size=size;
        this.description="HouseBlend";
    }
    @Override
    public double cost() {
        double original=20.1;
        if(this.size==SIZE.SMALL){
            original+=0.1;
        }
        else if(this.size==SIZE.MEDIUM){
            original+=0.2;
        }
        else{
            original+=0.3;
        }
        return original;
    }
}
