package HeadFirst_Design.RemoteControler.Applications;

import lombok.Data;

/**
 * 所有的家电的抽象
 */
@Data
public abstract class Application {
    private String name="";

    /**
     * 默认需要实现的开和关的方法
     */
    public abstract void on();
    public abstract void off();
}
