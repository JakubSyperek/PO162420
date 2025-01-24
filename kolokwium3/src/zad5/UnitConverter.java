package zad5;

public class UnitConverter implements Converter{
    private double amount = 20;
    private String currency = "USD";


    @Override
    public double convertToEuro(double amount) {
        return amount * 4.2;
    }

    @Override
    public double convertToUsd(double amount) {
        return amount * 4.7;
    }

    @Override
    public double getConversionRate(String currency) {
        return 0;
    }
}
