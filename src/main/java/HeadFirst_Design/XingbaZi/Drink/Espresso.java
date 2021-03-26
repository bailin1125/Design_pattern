package HeadFirst_Design.XingbaZi.Drink;

import HeadFirst_Design.XingbaZi.Beverage;
import HeadFirst_Design.XingbaZi.SIZE;

/**
 * 具体的浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso(SIZE size){
        this.size=size;
        this.description="Expresso";
    }
    @Override
    public double cost() {
        double original=9.9;
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
