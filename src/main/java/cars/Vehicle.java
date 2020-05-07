package cars;

public abstract class Vehicle {

    int price;
    int damage;

    public Vehicle(int price) {
        this.price = price;
        this.damage = 0;
    }

    public int getPrice() {
        return price;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
        this.price -= damage;
    }

    public void fixed() {
        this.price += this.damage;
        this.damage = 0;
    }
}
