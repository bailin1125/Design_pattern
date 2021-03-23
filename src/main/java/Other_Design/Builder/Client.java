package Other_Design.Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product producta = director.getAProduct();
        producta.showinfo();
        Product productb = director.getBProduct();
        productb.showinfo();

    }
}
