package Other_Design.Simple_factory.panckages;

/**
 * 薄馅饼的抽象类
 * 如果是其他种类的薄馅饼需要继承这个
 */
public abstract class Pancakge {

    protected String name;

    public void prepare() {
        System.out.println("准备中！");
    }

    public void fireAndFinish() {
        System.out.println("烤制出炉完成！");
    }

}
