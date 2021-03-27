package HeadFirst_Design.RemoteControler.Applications;

public class Door extends Application{
    public Door(String name){
        this.setName(name);
    }
    @Override
    public void on() {
        System.out.println("门打开了哦！");
    }

    @Override
    public void off() {
        System.out.println("门关闭了哦！");
    }
}
