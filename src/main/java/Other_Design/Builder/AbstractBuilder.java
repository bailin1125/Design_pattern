package Other_Design.Builder;

/**
 * 抽象建造者，将建造过程进行抽象
 * 一般有两个抽象方法，建造产品和返回产品
 */
abstract class AbstractBuilder {
    public abstract void setPart(String str1, String str2);

    public abstract Product getProduct();
}
