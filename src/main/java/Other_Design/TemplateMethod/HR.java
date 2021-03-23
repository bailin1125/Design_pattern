package Other_Design.TemplateMethod;

public class HR extends Worker {
    public HR(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + "看简历，打电话！");
    }
}
