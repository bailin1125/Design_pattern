package Other_Design.Simple_factory;

public class test {
    public static void main(String[] args) {
        PancakgeStore pancakgeStore = new SZpanckageStore();
        //pancakgeStore.createPanckage("normal");
        pancakgeStore.sellPanckage("normal");
        // pancakgeStore.createPanckage("sp");
        pancakgeStore.sellPanckage("sp");
    }
}
