package HeadFirst_Design.HomeTheaterFacade;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 将复杂的对象接口包装成简单的调用接口
 */
@Data
@AllArgsConstructor
public class HomeTheaterFacade {
    Amplifier amplifier;
    Dvd dvd;
    Popper popper;
    Projector projector;
    Light light;
    Screen screen;

    /**
     *  观看电影的简单外观
     */
    public void watchMovie(){
        System.out.println("开始观看电影了哦！");
        popper.on();
        popper.pop();
        light.dim(20);
        screen.donw();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(this.dvd);
        amplifier.setBackGround();
        amplifier.setVolume(20);
        dvd.on();
        dvd.play(new movie());
    }
}
