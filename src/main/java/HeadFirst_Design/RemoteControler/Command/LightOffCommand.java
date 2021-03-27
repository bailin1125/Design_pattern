package HeadFirst_Design.RemoteControler.Command;

import HeadFirst_Design.RemoteControler.Applications.Light;

public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
