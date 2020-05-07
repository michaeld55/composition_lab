package cars;

import components.Engine;
import components.Tyre;

public class PetrolCar extends Vehicle {


    String colour;
    Engine engine;
    Tyre tyre;

    public PetrolCar(int price, String colour, Engine engine, Tyre tyre) {
        super(price);
        this.colour = colour;
        this.engine = engine;
        this.tyre = tyre;
    }

    public String getColour() {
        return this.colour;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Tyre getTyre() {
        return this.tyre;
    }
}
