package Other_Design.Command.command;

/**
 * 所谓命令模式，就是将命令封装成类。
 * 然后命令的请求者和执行者相互解耦
 */
public interface Command {
    public void execute();//只有一种方法
}
