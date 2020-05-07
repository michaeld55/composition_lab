package components;

public class Engine {

    private int size;
    private String brand;

    public Engine(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }
}
