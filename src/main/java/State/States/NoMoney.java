package State.States;

import State.VendingMachine;
import State.State;

/**
 * 对应没钱的状态
 */
public class NoMoney implements State {
    private VendingMachine machine;

    /**
     * 构造方法
     */
    public NoMoney(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币成功！");
        machine.setState(machine.getHasmoney());

    }

    @Override
    public void backMoney() {
        System.out.println("您还没有投币呢！！！");

    }

    @Override
    public void turnChunk() {
        System.out.println("您还没有投币呢！！！");
    }

    @Override
    public void disPean() {
        throw new IllegalStateException("非法错误！");
    }
}
