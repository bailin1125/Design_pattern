package Command.command;


import Command.ElectonicDevices.Computer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ComputerOpen implements Command {
    private Computer computer;

    @Override
    public void execute() {
        computer.on();
    }
}
