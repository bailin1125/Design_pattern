package Other_Design.Command.command;


import Other_Design.Command.ElectonicDevices.Computer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ComputerOff implements Command {
    private Computer computer;

    @Override
    public void execute() {
        computer.off();
    }
}
