interface Drivable {
    void drive();
}
interface Engine {
    void startEngine();
    void stopEngine();
}
abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }
    abstract void fuelType();
    public void showBrand() {
        System.out.println("Brand: " + brand);
    }
}
class Car extends Vehicle implements Drivable, Engine {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println("Driving the car on the road.");
    }

    @Override
    void fuelType() {
        System.out.println("Fuel type: Petrol.");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine is now ON.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine is now OFF.");
    }
}
class ElectricBike extends Vehicle implements Drivable, Engine {

    public ElectricBike(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println("Riding the electric bike silently.");
    }

    @Override
    void fuelType() {
        System.out.println("Fuel type: Battery.");
    }

    @Override
    public void startEngine() {
        System.out.println("Electric bike is powered ON.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric bike is powered OFF.");
    }
}
class Boat extends Vehicle implements Drivable, Engine {

    public Boat(String brand) {
        super(brand);
    }
    @Override
    public void drive() {
        System.out.println("Sailing the boat smoothly on water.");
    }
    @Override
    void fuelType() {
        System.out.println("Fuel type: Diesel.");
    }
    @Override
    public void startEngine() {
        System.out.println("Boat engine started.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Boat engine stopped.");
    }
}
public class AbsTraction {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.showBrand();
        ((Engine) car).startEngine();
        ((Drivable) car).drive();
        car.fuelType();
        ((Engine) car).stopEngine();
        System.out.println();

        Vehicle ebike = new ElectricBike("Tesla");
        ebike.showBrand();
        ((Engine) ebike).startEngine();
        ((Drivable) ebike).drive();
        ebike.fuelType();
        ((Engine) ebike).stopEngine();
        System.out.println();

        Vehicle boat = new Boat("Yamaha");
        boat.showBrand();
        ((Engine) boat).startEngine();
        ((Drivable) boat).drive();
        boat.fuelType();
        ((Engine) boat).stopEngine();
    }
}

