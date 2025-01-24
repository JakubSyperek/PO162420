package zad5;

public interface Converter {

    double convertToEuro(double amount);
    double convertToUsd(double amount);
    double getConversionRate(String currency);
}
