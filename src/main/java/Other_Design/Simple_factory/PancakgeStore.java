package Other_Design.Simple_factory;

import Other_Design.Simple_factory.panckages.Pancakge;

/**
 * 使用抽象工厂方法
 * 其他的工厂应该继承下去
 */
public abstract class PancakgeStore {
    //需要修改的方法，如何产生薄馅饼
    public abstract Pancakge createPanckage(String type);

    public Pancakge sellPanckage(String type) {
        Pancakge pancakge = createPanckage(type);
        pancakge.prepare();
        pancakge.fireAndFinish();
        return pancakge;
    }
}
