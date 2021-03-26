package HeadFirst_Design.PizzaStore.PizzasandMaterial;

public class VeggiePizza extends Pizza{
    public VeggiePizza(){
        this.type="Veggie";
    }

    @Override
    public void showeProcedure() {
        System.out.println("我正在做Veggie披萨！");
    }
}
