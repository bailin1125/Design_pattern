package Other_Design.State;

/**
 * 所谓状态模式，就是针对状态进行编程，对状态之间的切换进行一定程度的扩展和更新
 * 这里以，自动售货机为例，讲解一个典型的状态模式
 */
public interface State {

    /**
     * 放钱
     */
    public void insertMoney();

    /**
     * 退钱
     */
    public void backMoney();

    /**
     * 转动把手
     */
    public void turnChunk();

    /**
     * 出商品
     */
    public void disPean();
}
