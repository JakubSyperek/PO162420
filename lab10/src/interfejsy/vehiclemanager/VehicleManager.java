package interfejsy.vehiclemanager;

public interface VehicleManager {
    String startEngine();
    int getFuelLevel();
}


//Wykonaj poniższe czynności:
//• Utwórz interfejs VehicleManager z dwoma metodami abstrakcyjnymi: startEngine()
//zwracającą String i getFuelLevel() zwracającą int.
//• Stwórz klasę Car, implementującą VehicleManager. W metodzie startEngine zwróć
//“Silnik samochodu uruchomiony”, a w getFuelLevel zwróć wartość 50.
//• Stwórz klasę Motorcycle, również implementującą VehicleManager. W startEngine
//zwróć “Silnik motocykla uruchomiony”, a w getFuelLevel zwróć wartość 30.
//• W klasie VehicleManagerTest stwórz obiekty obu klas i przetestuj ich metody.
