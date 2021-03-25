package HeadFirst_Design.WeatherData;


import java.util.Observer;

/**
 * 看看前面的设计得威力
 */
public class WeatherStation {
    public static void main(String[] args) {
        //WetherData weatherData=new WetherData();
        //Oberver currentDisplay=new CurrentDisplay(weatherData);
        NewWeatherData newWeatherData=new NewWeatherData();
        Observer observer=new NewCurrentDisplay(newWeatherData);
        Observer observer1=new NewForecastDisplay(newWeatherData);
        /**
         * 然后下面不断变化主题的数值，看看观察者的反应
         */
        newWeatherData.setMeasurements(80,65,32.4f);
        newWeatherData.setMeasurements(100,-5,78.4f);
        newWeatherData.setMeasurements(20,105,-5.4f);
    }
}
