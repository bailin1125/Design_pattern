package Other_Design.Command.command;

import Other_Design.Command.ElectonicDevices.Door;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DoorOpen implements Command {
    private Door door;

    @Override
    public void execute() {
        door.on();
    }
}
