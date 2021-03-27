package HeadFirst_Design.RemoteControler;

import HeadFirst_Design.RemoteControler.Applications.Application;
import HeadFirst_Design.RemoteControler.Command.Command;
import HeadFirst_Design.RemoteControler.Command.Nocommand;

/**
 * 遥控器的类
 */
public class Controler {
    private static final int APPLICATION_NUM=7;
    Command onCommand[];
    Command offCommand[];
    //记录上一个命令是什么
    Command lastcommand=null;

    /**
     *  构造方法，需要创造能够塞到里面的插槽
     */
    public Controler(){
        onCommand=new Command[APPLICATION_NUM];
        offCommand=new Command[APPLICATION_NUM];
        for(int i=0;i<APPLICATION_NUM;i++){
            onCommand[i]=new Nocommand();
            offCommand[i]=new Nocommand();
        }
    }
    /**
     * 设置命令的方法
     */
    public void setCommand(int slot,Command oncommand,Command offcommand){
        if(slot<APPLICATION_NUM){
            this.onCommand[slot]=oncommand;
            this.offCommand[slot]=offcommand;
        }
        return;
    }

    /**
     * 按下打开的调用
     */
    public void buttonOnPressed(int slot){
        this.onCommand[slot].execute();
        lastcommand=this.onCommand[slot];
    }

    /**
     * 关闭方法的调用
     */
    public void buttonOffPressed(int slot){
        this.offCommand[slot].execute();
        lastcommand=this.offCommand[slot];
    }
    /**
     * 到底什么是撤销命令？？
     */
    public void undoCommand(){
        //要求实现是不需要知道上一个命令是什么的情况
        lastcommand.undo();
        //注意这里有一个问题，什么叫上一个命令，执行两个撤销命令后，期望的结果是什么？？
    }

}
