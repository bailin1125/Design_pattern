package HeadFirst_Design.RemoteControler.Command;

/**
 * 引入了新的复杂度，如果有一堆命令怎么办
 */
public class PartiesCommand implements Command{
    Command command[];

    public PartiesCommand(Command command[]){
        this.command=command;

    }
    @Override
    public void execute() {
        for(int i=0;i<command.length;i++){
            command[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i=0;i<command.length;i++){
            command[i].undo();
        }
    }
}
