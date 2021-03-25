package HeadFirst_Design.XingbaZi;

/**
 * 咖啡的抽象的基类
 */
public abstract class Beverage {
    public String description="Unkown Beverage";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
