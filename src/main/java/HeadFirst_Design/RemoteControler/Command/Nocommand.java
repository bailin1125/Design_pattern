package HeadFirst_Design.RemoteControler.Command;

/**
 * 用来占位的空命令
 */
public class Nocommand implements Command{

    @Override
    public void execute() {
        System.out.println("我没用啊，我就是个空的指令……");
    }

    @Override
    public void undo() {
        System.out.println("我没用啊，我就是个空的指令……");
    }
}
