package clone;

public class Main4 {
    public static void main(String[] args) {
        try {
            Engine engine = new Engine(150, "Diesel", "SN12345");

            Car car = new Car("Toyota", "Corolla", engine);

            Car clonedCar = car.clone();

            car.getEngine().serialNumber = "SN54321";

            System.out.println("Oryginalny samochód: " + car);
            System.out.println("Sklonowany samochód: " + clonedCar);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}