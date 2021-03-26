package HeadFirst_Design.XingbaZi;

public abstract class Beverage {
    public String description="Unkown Beverage";
    public SIZE size;//添加一个杯子大小的字段
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
