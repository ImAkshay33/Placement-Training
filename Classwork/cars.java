
abstract class Car {
    protected String model;
    protected String color;
    
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    
    abstract void displayInfo();
}

interface FuelType {
    void refuel();
}
class Tata extends Car {
    protected String brand = "Tata";
    
    public Tata(String model, String color) {
        super(model, color);
    }
    
    @Override
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Color: " + color);
    }
}

class TataNano extends Tata {
    public TataNano(String color) {
        super("Tata Nano", color);
    }
}


class Diesel extends TataNano implements FuelType {
    public Diesel(String color) {
        super(color);
        this.model = "Tata Nano Diesel";
    }
    
    @Override
    public void refuel() {
        System.out.println("Refueling with Diesel...");
    }
}


class Petrol extends TataNano implements FuelType {
    public Petrol(String color) {
        super(color);
        this.model = "Tata Nano Petrol";
    }
    
    @Override
    public void refuel() {
        System.out.println("Refueling with Petrol...");
    }
}

class EV extends TataNano implements FuelType {
    public EV(String color) {
        super(color);
        this.model = "Tata Nano EV";
    }
    
    @Override
    public void refuel() {
        System.out.println("Charging Electric Vehicle...");
    }
}

class Owner {
    private String name;
    private String contactNumber;
    private Car ownedCar;
    
    public Owner(String name, String contactNumber, Car ownedCar) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.ownedCar = ownedCar;
    }
    
    public void displayOwnerInfo() {
        System.out.println("Owner: " + name + ", Contact: " + contactNumber);
        ownedCar.displayInfo();
    }
    
    public String getName() {
        return name;
    }
    
    public Car getOwnedCar() {
        return ownedCar;
    }
}

public class cars {
    
}
