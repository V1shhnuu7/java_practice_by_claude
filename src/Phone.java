
abstract class Phone1 {
    String brand;

    Phone1(String brand) {
        this.brand = brand;
    }

    // abstract method - every phone calls differently (4G, 5G etc)
    abstract void makeCall();

    // concrete method - every phone does this same way
    void chargeBattery() {
        System.out.println(brand + " is charging...");
    }
}

// Make two classes: Samsung and iPhone
// Both extend Phone
// Both implement makeCall() differently

class Samsung extends Phone1 {

    Samsung(String brand) {
        super(brand);
    }

    @Override
    void makeCall() {
        System.out.println("This uses 5G");
    }
}
class iPhone extends Phone1 {

    iPhone(String brand) {
        super(brand);
    }

    @Override
    void makeCall() {
        System.out.println("This uses both 4G and 5G");
    }
}

// Then in main - create both and call makeCall() and chargeBattery()
public class Phone {
    public static void main(String[] args) {
        Phone1 p1 = new Samsung("samsung s24 ultra");
        Phone1 p2 = new iPhone("iphone 15 plus");

        p1.makeCall();
        p1.chargeBattery();

        p2.makeCall();
        p2.chargeBattery();
    }
}