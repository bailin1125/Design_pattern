package Simple_factory;

import Simple_factory.panckages.NormalPanckage;
import Simple_factory.panckages.Pancakge;
import Simple_factory.panckages.SpecialPanckage;

/**
 * 特定的工厂
 */
public class SZpanckageStore extends PancakgeStore {
    @Override
    public Pancakge createPanckage(String type) {
        Pancakge pancakge = null;
        if (type.equals("normal")) {
            pancakge = new NormalPanckage();
        } else if (type.equals("sp")) {
            pancakge = new SpecialPanckage();
        } else
            pancakge = new NormalPanckage();
        return pancakge;
    }
}
