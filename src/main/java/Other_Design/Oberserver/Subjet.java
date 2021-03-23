package Other_Design.Oberserver;

/**
 * 观察者模式，观察的是对象，这里是一个基础类
 * 所有主题需要实现该接口
 */
public interface Subjet {

    /**
     * 注册一个观察者
     */
    public void registerObserber(Oberver oberver);

    /**
     * 移除一个观察者
     */
    public void removeObserver(Oberver oberver);

    /**
     * 通知所有的观察者
     */
    public void notifyObservers();
}