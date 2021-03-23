package Other_Design.TemplateMethod;

public class IT extends Worker {

    public IT(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + "写代码，修bug");

    }
}
