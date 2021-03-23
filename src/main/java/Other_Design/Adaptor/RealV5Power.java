package Other_Design.Adaptor;


public class RealV5Power implements V5Power {
    @Override
    public int providePower() {
        System.out.println("这是一种5v的充电器");
        return 5;
    }
}
