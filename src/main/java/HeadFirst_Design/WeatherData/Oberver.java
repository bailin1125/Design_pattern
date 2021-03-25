package HeadFirst_Design.WeatherData;

/**
 * 观察者需要继承的接口
 */
public interface Oberver {
    /**
     * 所有观察者需要实现的接口，从而接收更新的数值
     */
    public void update(float temp,float humidity,float presure);
}
