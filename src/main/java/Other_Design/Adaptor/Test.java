package Other_Design.Adaptor;

public class Test {
    public static void main(String[] args) {
        V220Power v220Power = new V220Power();
        PowerAdaptor powerAdaptor = new PowerAdaptor();
        powerAdaptor.setV220Power(v220Power);

        Mobile mobile = new Mobile();
        mobile.setV5Power(powerAdaptor);
        mobile.incharge();
    }
}
