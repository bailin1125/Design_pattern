package HeadFirst_Design.WeatherData;

/**
 * 具体的布告板的类
 */
public class CurrentDisplay implements Oberver,Displayment{
    /**
     * 持有一个主题对象的引用
     */
    private Subject subject;
    private float humidity;
    private float presure;
    private float temp;

    public CurrentDisplay(Subject subject){
        this.subject=subject;
        this.subject.registerObserver(this);
    }

    /**
     * 当数据更新之后，我们就先保存下来，然后执行display()方法
     * @param temp
     * @param humidity
     * @param presure
     */
    @Override
    public void update(float temp, float humidity, float presure) {
        this.temp=temp;
        this.humidity=humidity;
        this.presure=presure;
        display();
    }

    /**
     * 每个不同的布告板对应的展示数据的方法
     */
    @Override
    public void display() {
        System.out.println("小小布告板展示啦！！现在的温度是"+this.temp+" F,湿度是："+this.humidity+" ,压力是："+this.presure+" Pa!");
    }
}
