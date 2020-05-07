package owners;

import cars.PetrolCar;
import cars.Vehicle;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> vehicles;

    public Customer(int money){
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public int getMoney() {
        return money;
    }

    public int getVehiclesSize() {
        return vehicles.size();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public boolean buyVehicle(Vehicle vehicle) {
        boolean afford = false;

        if(this.getMoney() >= vehicle.getPrice()) {
            this.addVehicle(vehicle);
            this.money -= vehicle.getPrice();
            afford = true;
        }
        return afford;
    }
}
