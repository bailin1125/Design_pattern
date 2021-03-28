package HeadFirst_Design.HomeTheaterFacade;

/**
 * 装了所有的家电，同时也是启动类
 */
public class Application {
    public static void main(String[] args) {
        //实例化一些组件
        Projector projector=new Projector();
        Amplifier amplifier=new Amplifier();
        Dvd dvd=new Dvd();
        Light light=new Light();
        Popper popper=new Popper();
        Screen screen=new Screen();
        //调用这个外观做事
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(amplifier,dvd,popper,projector,light,screen);
        homeTheaterFacade.watchMovie();
        return;
    }
}

class Projector{
    //声明了内部的枚举类
    enum Style{
        WIDE_SCREEN,
        NORMAL
    }
    private Style style=null;
    public void on(){
        System.out.println("打开投影了哦！");
    }
    public void wideScreenMode(){
        this.style=Style.WIDE_SCREEN;
    }

}
class Screen{
    public void donw(){
        System.out.println("屏幕落下来了哦");
    }
}

class Popper{
    public void on(){
        System.out.println("爆米花机开始工作了！");
    }
    public void pop(){
        System.out.println("开始进行爆爆米花了！");
    }
}
class Light{
    public void dim(int num){
        System.out.println("电灯的亮度调整为："+num+" 了！");
    }
}
class movie{

}
class Dvd{
    public void on(){
        System.out.println("这个dvd开始放映啦");
    }
    public void play(movie movie){
        System.out.println("开始放映指定的电影了");
    }
}
class Amplifier{
    private Dvd dvd;
    public void on(){
        System.out.println("dvd 打开了哦");
    }
    public void setDvd(Dvd dvd){
        this.dvd=dvd;
    }
    public void setBackGround(){
        System.out.println("设置为了环境声音模式");
    }
    public void setVolume(int num){
        System.out.println("已经声音调整到了："+num+" 的音量了！");
    }
}