package Other_Design.Facade;


import Other_Design.Command.ElectonicDevices.Computer;
import Other_Design.Command.ElectonicDevices.Projector;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HomeTheaterFacade {
    private Computer computer;
    private Projector projector;


    public void watchMovie() {
        /**
         *  1、打开爆米花机
         2、制作爆米花
         3、将灯光调暗
         4、打开投影仪
         5、放下投影仪投影区
         6、打开电脑
         7、打开播放器
         8、将播放器音调设为环绕立体声
         */
        computer.on();
        projector.on();


    }

    public void stopMovie() {
        computer.off();
        projector.off();
    }
}

