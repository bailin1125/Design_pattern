package Other_Design.Oberserver;

/**
 * 所有的观察者需要实现该接口
 */
public interface Oberver {
    /**
     * 更新自己的消息
     */
    public void update(String msg);
}
