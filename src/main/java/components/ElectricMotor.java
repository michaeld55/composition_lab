package components;

public class ElectricMotor {

    private int size;
    private String brand;

    public ElectricMotor(int size, String brand) {
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
