package HeadFirst_Design.RemoteControler.Command;

import HeadFirst_Design.RemoteControler.Applications.Door;
import HeadFirst_Design.RemoteControler.Applications.Light;

/**
 * 电灯打开的操作
 */
public class DoorOnCommand implements Command{
    private Door door;
    public DoorOnCommand(Door door){
        this.door=door;
    }
    @Override
    public void execute() {
        door.on();
    }

    @Override
    public void undo() {
        door.off();
    }
}
