package Other_Design.Command.ElectonicDevices;

/**
 *
 */
public class Door implements Devices {

    @Override
    public void on() {
        System.out.println("门开啦");
    }

    @Override
    public void off() {
        System.out.println("门关闭啦！");
    }
}
