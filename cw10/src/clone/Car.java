package clone;

public class Car implements Cloneable {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();
        clonedCar.engine = this.engine.clone();
        return clonedCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}

//Stwórz klasę Engine (Silnik) z polami: power (moc), type (typ silnika), serialNumber
//(numer seryjny). Dodaj konstruktor parametryczny oraz zaimplementuj interfejs
//Cloneable.
//Stwórz klasę Car (Samochód). Klasa Car powinna mieć pola: make (marka), model
//(model), engine typu Engine (silnik). Dodaj konstruktor parametryczny oraz zaimplementuj
//interfejs Cloneable.