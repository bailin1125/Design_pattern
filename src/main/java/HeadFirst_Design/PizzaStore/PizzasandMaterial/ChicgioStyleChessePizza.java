package HeadFirst_Design.PizzaStore.PizzasandMaterial;

public class ChicgioStyleChessePizza extends Pizza{

    public ChicgioStyleChessePizza(){

        this.toppings.add("Shreeed Mozzarella Pizza");
    }

    @Override
    public void showeProcedure() {

    }
    @Override
    public void cut(){
        System.out.println("这里制作我要切成方块哦！");
    }
}
