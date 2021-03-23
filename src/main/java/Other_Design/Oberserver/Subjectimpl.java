package Other_Design.Oberserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个发布主题的实现类
 */
public class Subjectimpl implements Subjet {

    /**
     * 持有的所有的观察者
     */
    private List<Oberver> obervers = new ArrayList<Oberver>();
    /**
     * 用来发送的信息
     */
    private String msg;


    public void registerObserber(Oberver oberver) {
        obervers.add(oberver);

    }

    public void removeObserver(Oberver oberver) {
        int index = obervers.indexOf(oberver);
        if (index >= 0) {
            obervers.remove(oberver);
        }

    }

    public void notifyObservers() {
        for (Oberver oberver : obervers) {
            oberver.update(msg);
        }

    }

    /**
     * 主题更新消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();


    }
}
