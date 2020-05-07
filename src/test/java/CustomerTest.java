import cars.PetrolCar;
import components.Engine;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;
import owners.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        customer = new Customer(124);
        engine = new Engine(6, "Honda");
        tyre = new Tyre(12, "Firestone");

        petrolCar = new PetrolCar(123, "Red", engine, tyre);
    }

    @Test
    public void hasInfo(){
        assertEquals(124, customer.getMoney());
        assertEquals(0, customer.getVehiclesSize());
    }

    @Test
    public void canAddVehicle(){
        customer.addVehicle(petrolCar);
        assertEquals(1, customer.getVehiclesSize());
    }

    @Test
    public void testCanAffordVehicle(){
        customer.buyVehicle(petrolCar);
        assertEquals(1, customer.getVehiclesSize());
        assertEquals(1, customer.getMoney());
    }
}
