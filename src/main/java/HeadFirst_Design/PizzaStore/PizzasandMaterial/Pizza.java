package HeadFirst_Design.PizzaStore.PizzasandMaterial;

import java.util.ArrayList;

/**
 * pizza的基类
 */
public abstract class Pizza {
    public String type;
    public ArrayList<String>toppings=new ArrayList();
    public double cost;

    /**
     * 新增加的部分的全新的材料
     */
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepproni pepproni;
    Clams clams;


    /**
     * 有了新原料之后，我们需要修改这个部分
     */
    //abstract void prepare();
    public void prepare(){
        toppings.forEach(e->{
            System.out.println("增加了馅料 "+e);
        });
    }
    public void bake(){
        System.out.println("Baking");
    }
    public void cut(){
        System.out.println("Cutting");
    }
    public void box(){
        System.out.println("Boxing");
    }
    public abstract void showeProcedure();

}
