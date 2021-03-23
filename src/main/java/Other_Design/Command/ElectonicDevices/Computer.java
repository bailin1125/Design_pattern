package Other_Design.Command.ElectonicDevices;

/**
 * 电器的实体类
 */
public class Computer implements Devices {

    @Override
    public void on() {
        System.out.println("电脑开机啦！");
    }

    @Override
    public void off() {
        System.out.println("电脑关机啦");
    }
}
