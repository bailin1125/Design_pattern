package Other_Design.SingelInstance;

/**
 * 首先验证饿汉式，也就是加载的时候就有了
 */
public class SingleHungry {
    private static SingleHungry instance = new SingleHungry();

    private SingleHungry() {
    }

    ;

    //获取实体的方法
    public static SingleHungry getInstance() {
        return instance;
    }
}
