package HeadFirst_Design.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 这是一个观察者哦
 */
public class NewCurrentDisplay implements Displayment, Observer {
    private Observable observable;
    private float temp;
    private float humidity;
    private  float presure;

    public NewCurrentDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("在下是新型的数据展示板，温度是："+this.temp+"F,湿度是："+this.humidity+",气压是："+this.presure+"Pa!");
    }

    /**
     * 关键是这里的方法，我们希望实现这个拉的方法，数据是从观察者这里尝试获得的
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof NewWeatherData){
            NewWeatherData newWeatherData=(NewWeatherData) o;
            this.humidity=newWeatherData.getHumidity();
            this.presure=newWeatherData.getPresure();
            this.temp=newWeatherData.getTemp();
            display();
        }

    }
}
