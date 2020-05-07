package cars;

import components.ElectricMotor;

import components.Tyre;

public class ElectricCar extends Vehicle {


    String colour;
    ElectricMotor motor;
    Tyre tyre;

    public ElectricCar(int price, String colour, ElectricMotor motor, Tyre tyre) {
        super(price);
        this.colour = colour;
        this.motor = motor;
        this.tyre = tyre;
    }

    public String getColour() {
        return colour;
    }

    public ElectricMotor getMotor() {
        return motor;
    }

    public Tyre getTyre() {
        return tyre;
    }
}
