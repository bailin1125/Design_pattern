package HeadFirst_Design.PizzaStore.PizzasandMaterial;

public class ChessePizza extends Pizza{
    public ChessePizza(){
        this.type="Cheese";
    }

    @Override
    public void showeProcedure() {
        System.out.println("我正在做起司披萨！");
    }
}
