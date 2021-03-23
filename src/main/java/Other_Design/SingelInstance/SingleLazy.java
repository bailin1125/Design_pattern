package Other_Design.SingelInstance;


/**
 * 一般实现使用这种方法，也就是说懒加载，用到的时候才会加载
 * 使用了双重校验完成了多线程安全
 */
public class SingleLazy {
    private static SingleLazy instance = null;

    private SingleLazy() {
    }

    ;

    public static SingleLazy getInstance() {
        if (instance == null) {
            synchronized (SingleLazy.class) {
                if (instance == null) {
                    instance = new SingleLazy();
                }
            }
        }
        return instance;
    }
}
