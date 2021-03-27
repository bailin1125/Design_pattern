package HeadFirst_Design.RemoteControler;

import HeadFirst_Design.RemoteControler.Applications.Door;
import HeadFirst_Design.RemoteControler.Applications.Fan;
import HeadFirst_Design.RemoteControler.Applications.Light;
import HeadFirst_Design.RemoteControler.Command.*;

/**
 * 执行测试类
 * 命令模式
 */
public class ControlerTest {
    public static void main(String[] args) {
        Controler controler=new Controler();
        Light light=new Light("客厅灯");
        Light light1=new Light("厨房");
        Door door=new Door("地下室");
        Fan fan=new Fan("电风扇");

        /**
         * 然后初始化一些开关去绑定这些玩意
         */
        Command lightOnCommand=new LightOnCommand(light);
        Command command=new LightOffCommand(light);
        Command command1=new LightOffCommand(light1);
        Command command2=new LightOnCommand(light1);
        Command command3=new DoorOffCommand(door);
        Command command4=new DoorOnCommand(door);
        Command command5=new FanOnCommand(fan);
        Command command6=new FanOffCommand(fan);
        /**
         * 绑定到遥控器上
         */
        controler.setCommand(0,lightOnCommand,command);
        controler.setCommand(1,command2,command1);
        controler.setCommand(2,command4,command3);
        controler.setCommand(3,command5,command6);
        /**
         * 开始进行调用
         */
        for(int i=0;i<4;i++){
            controler.buttonOnPressed(i);
            controler.buttonOffPressed(i);
        }
        controler.undoCommand();
        controler.undoCommand();

        /**
         * 下面测试一组命令是如何一键搞定的
         */
        System.out.println("开始调试一组命令是如何成功的！");
        Command command7[]={lightOnCommand,command2,command4,command5};
        Command command8[]={command,command1,command3,command6};
        PartiesCommand partiesCommand=new PartiesCommand(command7);
        PartiesCommand partiesCommand1=new PartiesCommand(command8);
        controler.setCommand(5,partiesCommand,partiesCommand1);
        System.out.println("一组命令打开！");
        controler.buttonOnPressed(5);
        System.out.println("一组命令关闭");
        controler.buttonOffPressed(5);
        System.out.println("撤销这一组命令");
        controler.undoCommand();
    }
}
