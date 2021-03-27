package HeadFirst_Design.RemoteControler.Applications;

public class Fan extends Application{
    public Fan(String name){
        this.setName(name);
    }
    @Override
    public void on() {
        System.out.println("电风扇打开了哦");
    }

    @Override
    public void off() {
        System.out.println("电风扇关闭了哦！");
    }
}
