package Command;

import Command.ElectonicDevices.Computer;
import Command.ElectonicDevices.Door;
import Command.command.*;

public class test {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        Door door = new Door();
        Computer computer = new Computer();
        controlPanel.setCommand(0, new DoorOpen(door));
        controlPanel.setCommand(1, new DoorClose(door));
        controlPanel.setCommand(2, new ComputerOpen(computer));
        controlPanel.setCommand(3, new ComputerOff(computer));
        for (int i = 0; i < 4; i++) {
            controlPanel.keyPressed(i);
        }

    }
}
