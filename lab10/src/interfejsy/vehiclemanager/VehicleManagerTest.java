package interfejsy.vehiclemanager;

public class VehicleManagerTest {
    public static void main(String[] args) {
        VehicleManager car = new Car();
        System.out.println("Samochód:");
        System.out.println(car.startEngine());
        System.out.println("Poziom paliwa: " + car.getFuelLevel() + " litrów");

        VehicleManager motorcycle = new Motorcycle();
        System.out.println("\nMotocykl:");
        System.out.println(motorcycle.startEngine());
        System.out.println("Poziom paliwa: " + motorcycle.getFuelLevel() + " litrów");
    }
}
