package HeadFirst_Design.RemoteControler.Command;

import HeadFirst_Design.RemoteControler.Applications.Door;

/**
 * 电灯打开的操作
 */
public class DoorOffCommand implements Command{
    private Door door;
    public DoorOffCommand(Door door){
        this.door=door;
    }
    @Override
    public void execute() {
        door.off();
    }

    @Override
    public void undo() {
        door.on();
    }
}
