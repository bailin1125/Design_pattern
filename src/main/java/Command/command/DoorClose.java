package Command.command;


import Command.ElectonicDevices.Door;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DoorClose implements Command {
    private Door door;

    @Override
    public void execute() {
        door.off();
    }
}
