package interfejsy.vatcalculator;

public interface VATCalculator {
    double vatRate = 0.23;
    static double calculateWithVAT(double price) {
        return price + (price * vatRate);
    }
}

//Stwórz interfejs VATCalculator z:
//• Polem double vatRate ustawionym na wartość standardowej stawki VAT (np. 23%).
//• Metodą statyczną calculateWithVAT(double price), która oblicza i zwraca cenę produktu
//z doliczonym VAT.
//Stwórz klasę testującą VATTest, która wywołuje metodę calculateWithVAT(double price)
//z przykładową ceną produktu i wyświetla wynik.