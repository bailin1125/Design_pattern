package HeadFirst_Design.Singleton;

/**
 * 一个实现非常简单的单例模式的应用
 * 特点是延迟实例化
 */
public class SimpleSingleton {
    private static SimpleSingleton simpleSingleton=null;
    private SimpleSingleton(){}

    /**
     * 创造单例的方法
     */
    public static SimpleSingleton getInstance(){
        if(simpleSingleton==null){
            simpleSingleton=new SimpleSingleton();
        }
        return simpleSingleton;
    }
}
