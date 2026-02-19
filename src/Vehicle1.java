// 1. Create interface
interface Vehicle {
    void speed();
    void fuelType();
}

// 2. Fill this class
class Car implements Vehicle {

    @Override
    public void speed() {
        System.out.println("Car speed: 120 km/h");
    }

    @Override
    public void fuelType() {
        System.out.println("Car fuel: Petrol");
    }
}

// 3. Fill this class
class ElectricBike implements Vehicle {
    public void speed() {
        System.out.println("Bike speed: 80 km/h");
    }
    public void fuelType() {
        System.out.println( "Bike fuel: Electric");
    }
}

// 4. In main:
// Create Vehicle objects using upcasting
// Call speed() and fuelType() on both
public class Vehicle1 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new ElectricBike();

        v1.speed();
        v1.fuelType();

        v2.speed();
        v2.fuelType();
    }
}