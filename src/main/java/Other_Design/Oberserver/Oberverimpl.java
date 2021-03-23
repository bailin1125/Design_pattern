package Other_Design.Oberserver;

/**
 * 观察者的实现类
 */
public class Oberverimpl implements Oberver {

    private Subjet subjet;

    //构造方法
    public Oberverimpl(Subjet subjet) {
        this.subjet = subjet;
        subjet.registerObserber(this);
    }

    public void update(String msg) {
        System.out.println("观察者oberver 观察到了subject " + msg + ",记录");

    }
}
