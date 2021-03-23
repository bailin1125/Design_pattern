package Other_Design.State.States;

import Other_Design.State.State;
import Other_Design.State.VendingMachine;

import java.util.Random;

/**
 * 对应有钱的状态
 */
public class HasMoney implements State {
    private VendingMachine machine;
    private final Random random = new Random();

    public HasMoney(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("已经投过币了，不要再投了！");
    }

    @Override
    public void backMoney() {
        System.out.println("退币成功！");
        machine.setState(machine.getNomoney());
    }

    @Override
    public void turnChunk() {

        System.out.println("您转动了手柄！");
        int winner = random.nextInt(10);
        if (winner == 0 && machine.getCount() > 1) {
            machine.setState(machine.getWinner());
        } else {
            machine.setState(machine.getSolding());
        }
    }

    @Override
    public void disPean() {
        throw new IllegalStateException("还是非法状态！");

    }


}
