package HeadFirst_Design.RemoteControler.Applications;

/**
 * 电灯的相关的类
 * 具体的动作的执行者需要知道如何完成事情
 */
public class Light extends Application{
    public Light(String name){
        this.setName(name);
    }
    @Override
    public void on() {
        System.out.println("电灯打开了哦！");
    }

    @Override
    public void off() {
        System.out.println("电灯关闭了哦！");
    }
}
