package Other_Design.State.States;

import Other_Design.State.State;
import Other_Design.State.VendingMachine;

/**
 * 准备售出的状态，这个状态不能允许用户有任何的操作
 */
public class Solding implements State {
    private VendingMachine machine;

    public Solding(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("正在出货中！");
    }

    @Override
    public void backMoney() {
        System.out.println("正在出货中！");
    }

    @Override
    public void turnChunk() {
        System.out.println("正在出货中！");
    }

    @Override
    public void disPean() {
        machine.dispaen();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNomoney());
        } else {
            System.out.println("商品已经售罄！！");
            machine.setState(machine.getSoldout());
        }
    }
}
