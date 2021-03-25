package HeadFirst_Design.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 另外一种情况下的布告板
 */
public class NewForecastDisplay implements Displayment, Observer {
    private float currentPresure=0;
    private float lastPresure;
    public NewForecastDisplay(Observable observable){
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("之前的气压是："+lastPresure+"Pa,现在的气压是："+currentPresure+"Pa!");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof NewWeatherData){
            NewWeatherData newWeatherData=(NewWeatherData)o;
            lastPresure=currentPresure;
            currentPresure=newWeatherData.getPresure();
            display();
        }
    }
}
