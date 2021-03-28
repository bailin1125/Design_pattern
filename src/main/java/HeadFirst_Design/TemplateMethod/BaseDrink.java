package HeadFirst_Design.TemplateMethod;

/**
 * 关于饮料的基类
 */
public abstract class BaseDrink {
    /**
     * 封装的模板算法，总是执行这样的过程
     */
    public final void prepareDrink(){
        bowWater();
        brew();
        if(hook()){
            addGridents();
        }
        drinkInCup();

    }
    public void bowWater(){
        System.out.println("开始烧水了！");
    }
    //具体冲泡的方法，由子类实现
    abstract void brew();
    //添加调料的方法，由子类实现
    abstract void addGridents();

    public void drinkInCup(){
        System.out.println("将饮料放到了杯子里啦");
    }
    //添加一个钩子方法，暂时不实现
    //子类可以在可选的情况下实现这个类
    public boolean hook(){
        return true;
    }
}
