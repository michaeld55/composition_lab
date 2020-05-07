import cars.ElectricCar;
import components.ElectricMotor;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricMotor motor;
    Tyre tyre;
    ElectricCar electricCar;

    @Before
    public void before(){

        tyre = new Tyre(12, "Firestone");
        motor = new ElectricMotor(200, "Tesla");
        electricCar = new ElectricCar(123, "Red", motor, tyre);
    }

    @Test
    public void hasInfo(){
        assertEquals(123, electricCar.getPrice());
        assertEquals("Red", electricCar.getColour());
        assertEquals(motor, electricCar.getMotor());
        assertEquals(tyre, electricCar.getTyre());
        assertEquals(200, electricCar.getMotor().getSize());
    }
}
