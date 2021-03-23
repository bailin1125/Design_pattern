package Other_Design.Proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadfromDisk();
    }

    @Override
    public void display() {
        System.out.println("show the pictures:" + filename);
    }

    private void loadfromDisk() {
        System.out.println("loading from disk:" + filename);
    }
}
