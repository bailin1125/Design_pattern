package Other_Design.State.States;

import Other_Design.State.VendingMachine;
import Other_Design.State.State;

/**
 * 中奖的状态，不允许用户有任何的操作
 */
public class Winner implements State {
    private VendingMachine machine;

    public Winner(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        throw new IllegalStateException("依旧是非法状态！");
    }

    @Override
    public void backMoney() {
        throw new IllegalStateException("依旧是非法状态！");
    }

    @Override
    public void turnChunk() {
        throw new IllegalStateException("依旧是非法状态！");
    }

    @Override
    public void disPean() {
        System.out.println("恭喜您已经中奖了！！");
        if (machine.getCount() == 0) {
            System.out.println("商品已经售罄");
            machine.setState(machine.getSoldout());
        } else {
            machine.dispaen();
            if (machine.getCount() > 0) {
                machine.setState(machine.getNomoney());
            } else {
                System.out.println("商品已经售罄");
                machine.setState(machine.getSoldout());
            }
        }
    }
}
