import cars.PetrolCar;
import components.Engine;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;
import owners.Customer;
import owners.Dealership;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;
    Customer customer;

    @Before
    public void before(){
        dealership = new Dealership(124);
        engine = new Engine(6, "Honda");
        tyre = new Tyre(12, "Firestone");
        customer = new Customer(124);
        petrolCar = new PetrolCar(123, "Red", engine, tyre);
    }

    @Test
    public void hasInfo(){
        assertEquals(124, dealership.getTill());
        assertEquals(0, dealership.getStockSize());
    }

    @Test
    public void canAddVehicle(){
        dealership.addStock(petrolCar);
        assertEquals(1, dealership.getStockSize());
    }

    @Test
    public void testCanAffordVehicle(){
        dealership.buyVehicle(petrolCar);
        assertEquals(1, dealership.getStockSize());
        assertEquals(1, dealership.getTill());
    }

    @Test
    public void testSellVehicle(){
        dealership.addStock(petrolCar);
        dealership.sellVehicle(petrolCar, customer);

        assertEquals(0, dealership.getStockSize());
        assertEquals( 1, customer.getVehiclesSize());
        assertEquals( 1, customer.getMoney());
        assertEquals( 247, dealership.getTill());
    }

    @Test
    public void testRepairDamage(){

        petrolCar.setDamage(10);
        dealership.repairVehicle(petrolCar);

        assertEquals(123, petrolCar.getPrice());
        assertEquals(0, petrolCar.getDamage());
        assertEquals(114, dealership.getTill());

    }
}
