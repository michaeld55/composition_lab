import cars.PetrolCar;
import components.Engine;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        engine = new Engine(6, "Honda");
        tyre = new Tyre(12, "Firestone");

        petrolCar = new PetrolCar(123, "Red", engine, tyre);
    }

    @Test
    public void hasInfo(){
        assertEquals(123, petrolCar.getPrice());
        assertEquals("Red", petrolCar.getColour());
        assertEquals( engine, petrolCar.getEngine());
        assertEquals(tyre, petrolCar.getTyre());
        assertEquals(6, petrolCar.getEngine().getSize());
    }

    @Test
    public void testDamage(){
        petrolCar.setDamage(10);
        assertEquals(113, petrolCar.getPrice());
        assertEquals(10, petrolCar.getDamage());
    }

}
