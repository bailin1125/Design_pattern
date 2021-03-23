package Other_Design.Adaptor;

import lombok.Data;

/**
 * 进行电压的准换
 */
@Data
public class PowerAdaptor implements V5Power {
    private V220Power v220Power;

    @Override
    public int providePower() {
        int power = v220Power.providePower();
        System.out.println("作为适配器我修改了电压");
        return 5;
    }
}
