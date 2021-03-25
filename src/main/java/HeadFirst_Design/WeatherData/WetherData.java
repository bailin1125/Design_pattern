package HeadFirst_Design.WeatherData;

import java.util.ArrayList;

/**
 * 具体的天气信息的类
 */
public class WetherData implements Subject{

    private ArrayList<Oberver> obervers;
    private float temp;
    private float presure;
    private float humidity;

    public WetherData(){
        obervers=new ArrayList();
    }

    @Override
    public void registerObserver(Oberver oberver) {
        obervers.add(oberver);
    }

    @Override
    public void removeObserver(Oberver oberver) {
        int index=obervers.indexOf(oberver);
        if(index>=0){
            obervers.remove(index);
        }
    }

    /**
     * 通知所有的观察者的方法
     */
    @Override
    public void notifyObservers() {
       obervers.forEach(observer->observer.update(temp,humidity,presure));
    }
    /**
     * 实现有变化的时候通知
     */
    public void measurementChanged(){
        notifyObservers();
    }
    /**
     * 提供一个测试方法
     */
    public void setMeasurements(float temp,float humidity,float presure){
        this.temp=temp;
        this.humidity=humidity;
        this.presure=presure;
        measurementChanged();
    }

}
