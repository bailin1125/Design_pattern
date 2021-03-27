package HeadFirst_Design.RemoteControler.Command;

import HeadFirst_Design.RemoteControler.Applications.Light;

/**
 * 电灯打开的操作
 */
public class LightOnCommand implements Command{
    private Light light;
    public LightOnCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
