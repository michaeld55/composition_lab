package cars;

import components.ElectricMotor;
import components.Engine;
import components.Tyre;

public class HybridCar extends Vehicle {


    String colour;
    Engine engine;
    ElectricMotor motor;
    Tyre tyre;

    public HybridCar(int price, String colour, Engine engine, ElectricMotor motor, Tyre tyre) {
        super(price);
        this.colour = colour;
        this.engine = engine;
        this.motor = motor;
        this.tyre = tyre;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColour() {
        return this.colour;
    }

    public ElectricMotor getMotor() {
        return this.motor;
    }

    public Tyre getTyre() {
        return this.tyre;
    }
}
