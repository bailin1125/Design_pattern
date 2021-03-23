package Other_Design.Builder;

/**
 * 一般来说导演类封装了易变的部分
 * 调用适当的建造者来构造商品
 */
public class Director {
    private AbstractBuilder builder = new ConcreteBuilder();

    public Product getAProduct() {
        builder.setPart("宝马", "高端");
        return builder.getProduct();
    }

    public Product getBProduct() {
        builder.setPart("特斯拉", "智能驾驶");
        return builder.getProduct();
    }
}
