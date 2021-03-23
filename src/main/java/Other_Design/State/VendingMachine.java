package Other_Design.State;

import Other_Design.State.States.*;
import lombok.Data;

/**
 * 自动售货机相关代码
 */
@Data
public class VendingMachine {

    private State nomoney;
    private State hasmoney;
    private State soldout;
    private State solding;
    private State winner;
    private int count = 0;
    private State currentState = nomoney;

    public VendingMachine(int count) {
        nomoney = new NoMoney(this);
        hasmoney = new HasMoney(this);
        solding = new Solding(this);
        soldout = new SoldOut(this);
        winner = new Winner(this);
        if (count > 0) {
            this.count = count;
            currentState = nomoney;
        }

    }

    /**
     * 向售货机投钱
     */
    public void insertMoney() {
        currentState.insertMoney();
    }

    /**
     * 要求退钱
     */
    public void backMoney() {
        currentState.backMoney();
    }

    /**
     * 转动扳手
     */
    public void turnChunk() {
        currentState.turnChunk();
        if (currentState == solding || currentState == winner) {
            currentState.disPean();
        }
    }

    /**
     * 发出一件商品
     */
    public void dispaen() {
        System.out.println("发出一件商品！");
        if (count != 0)
            count -= 1;
    }

    /**
     * 设定相关的状态
     */
    public void setState(State state) {
        this.currentState = state;
    }

}
