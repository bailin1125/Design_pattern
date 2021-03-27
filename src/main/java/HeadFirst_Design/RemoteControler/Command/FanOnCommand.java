package HeadFirst_Design.RemoteControler.Command;

import HeadFirst_Design.RemoteControler.Applications.Fan;

/**
 * 电灯打开的操作
 */
public class FanOnCommand implements Command{
    private Fan fan;
    public FanOnCommand(Fan fan){
        this.fan=fan;
    }
    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
