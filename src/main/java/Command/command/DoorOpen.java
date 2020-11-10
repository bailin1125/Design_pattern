package Command.command;

import Command.ElectonicDevices.Door;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DoorOpen implements Command {
    private Door door;

    @Override
    public void execute() {
        door.on();
    }
}
