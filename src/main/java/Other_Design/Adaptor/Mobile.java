package Other_Design.Adaptor;

import lombok.Data;

/**
 * 原本实体类
 */
@Data
public class Mobile {
    private V5Power v5Power;

    public void incharge() {
        int power = v5Power.providePower();
        if (power == 5) {
            System.out.println("电压合适");
        } else {
            System.out.println("电压不合适");
        }
    }
}
