package owners;

import cars.PetrolCar;
import cars.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private int till;
    ArrayList<Vehicle> stock;

    public Dealership(int till) {
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
    }

    public int getTill() {
        return till;
    }

    public int getStockSize(){
        return stock.size();
    }

    public void addStock(Vehicle vehicle){
        stock.add(vehicle);
    }

    public boolean buyVehicle(Vehicle vehicle) {
        boolean afford = false;
        if(this.getTill() >= vehicle.getPrice()) {
            this.addStock(vehicle);
            this.till -= vehicle.getPrice();
            afford = true;
        }
        return afford;
    }

    public void sellVehicle(Vehicle vehicle, Customer customer) {
        if (this.stock.contains(vehicle)) {
            if (customer.buyVehicle(vehicle)) {
                this.stock.remove(vehicle);
                this.till += vehicle.getPrice();
            }
        }else if(this.buyVehicle(vehicle)){
            if (customer.buyVehicle(vehicle)) {
                this.stock.remove(vehicle);
                this.till += vehicle.getPrice();
            }
        }
    }

    public void repairVehicle(Vehicle vehicle) {

        this.till -= vehicle.getDamage();
        vehicle.fixed();

    }
}
