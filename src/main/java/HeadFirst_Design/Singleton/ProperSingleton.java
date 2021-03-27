package HeadFirst_Design.Singleton;

/**
 * 看看一个实现的比较好的单例模式
 * 注意java1.5之前这个有问题，volatile关键字可能有问题
 * 双重检查加锁
 * 注意点：1 尽量不要继承单例模式   2全局变量可能会带来命名空间问题，但是不能确保只有一个实例  3注意类加载器问题
 */
public class ProperSingleton {
    private static volatile ProperSingleton properSingleton=null;
    private ProperSingleton(){}

    /**
     * 全局获得单件的方法
     */
    public static ProperSingleton getInstance(){
        if(properSingleton==null){
            synchronized (ProperSingleton.class){
                if(properSingleton==null){
                    properSingleton=new ProperSingleton();
                }
            }
        }
        return properSingleton;
    }
}
