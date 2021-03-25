package HeadFirst_Design.WeatherData;

/**
 *实现观察者模式的主题接口
 */
public interface Subject {
    public void registerObserver(Oberver oberver);
    public void removeObserver(Oberver oberver);

    /**
     * 当消息更新时候，该方法会调用，从而通知所有的观察者
     */
    public void notifyObservers();
}
