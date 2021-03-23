package Other_Design.State.States;

import Other_Design.State.VendingMachine;
import Other_Design.State.State;

/**
 * 对应已经售罄的状态
 */
public class SoldOut implements State {
    private VendingMachine machine;

    public SoldOut(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币失败，现在已经售罄了！");

    }

    @Override
    public void backMoney() {
        System.out.println("？？？");

    }

    @Override
    public void turnChunk() {
        System.out.println("没用啊兄嘚，现在已经售罄了！");
    }

    @Override
    public void disPean() {
        throw new IllegalStateException("依旧是非法状态！");
    }
}
