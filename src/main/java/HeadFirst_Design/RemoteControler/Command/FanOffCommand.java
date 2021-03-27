package HeadFirst_Design.RemoteControler.Command;

import HeadFirst_Design.RemoteControler.Applications.Door;
import HeadFirst_Design.RemoteControler.Applications.Fan;

/**
 * 电灯打开的操作
 */
public class FanOffCommand implements Command{
    private Fan fan;
    public FanOffCommand(Fan fan){
        this.fan=fan;
    }
    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo() {
        fan.on();
    }
}
