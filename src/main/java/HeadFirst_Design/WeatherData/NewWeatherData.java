package HeadFirst_Design.WeatherData;

import lombok.Data;

import java.util.Observable;

@Data
public class NewWeatherData extends Observable {
    private float temp;
    private float humidity;
    private  float presure;
    public NewWeatherData(){}

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    /**
     * 改变数值的方法
     * @param temp
     * @param humidity
     * @param presure
     */
    public void setMeasurements(float temp,float humidity,float presure){
        this.temp=temp;
        this.humidity=humidity;
        this.presure=presure;
        measurementChanged();
    }
}
