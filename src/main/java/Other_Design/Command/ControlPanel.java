package Other_Design.Command;

import Other_Design.Command.command.Command;

/**
 * 我们为命令封装起来，调用从这里调用就可以
 * 控制器调用的时候不关心具体命令是什么，只是让对应命令生效
 */
public class ControlPanel {
    public static final int MAX_SIZE = 9;
    private Command[] commands;

    public ControlPanel() {
        commands = new Command[MAX_SIZE];
    }

    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    /**
     * 按下按钮，执行命令的方法
     */
    public void keyPressed(int index) {
        commands[index].execute();
    }
}
