import cars.HybridCar;
import cars.PetrolCar;
import components.ElectricMotor;
import components.Engine;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    Engine engine;
    ElectricMotor motor;
    Tyre tyre;
    HybridCar hybridCar;

    @Before
    public void before(){
        engine = new Engine(6, "Honda");
        tyre = new Tyre(12, "Firestone");
        motor = new ElectricMotor(200, "Tesla");
        hybridCar = new HybridCar(123, "Red", engine, motor, tyre);
    }

    @Test
    public void hasInfo(){
        assertEquals(123, hybridCar.getPrice());
        assertEquals("Red", hybridCar.getColour());
        assertEquals( engine, hybridCar.getEngine());
        assertEquals(motor, hybridCar.getMotor());
        assertEquals(tyre, hybridCar.getTyre());
        assertEquals(6, hybridCar.getEngine().getSize());
    }

}
