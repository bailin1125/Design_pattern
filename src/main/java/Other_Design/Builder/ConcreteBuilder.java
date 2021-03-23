package Other_Design.Builder;


/**
 * 具体的建造者，职能是实现抽象构建者的方法
 */
public class ConcreteBuilder extends AbstractBuilder {
    private Product product = new Product();

    public void setPart(String str1, String str2) {
        product.setName(str1);
        product.setType(str2);
    }

    public Product getProduct() {
        return product;
    }
}
