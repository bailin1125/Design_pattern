package HeadFirst_Design.RemoteControler.Command;

/**
 * 实现相关的命令的抽象接口
 */
public interface Command {
    public void execute();
    /**
     * 新的设计要求，需要加上命令撤销功能
     */
    public void undo();
}
