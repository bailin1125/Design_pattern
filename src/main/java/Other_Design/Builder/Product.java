package Other_Design.Builder;

import lombok.Data;

/**
 * 所谓建造者模式，就是将复杂的对象的构建和表示进行分离
 * 使得同样的构建过程可以创建不同的表示
 */
@Data
public class Product {
    private String name;
    private String type;

    public void showinfo() {
        System.out.println("名字为：" + name + ",类型为:" + type);
    }
}
