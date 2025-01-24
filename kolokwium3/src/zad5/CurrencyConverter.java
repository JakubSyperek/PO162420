package zad5;

public class CurrencyConverter implements Converter{
    private double amount = 50;
    private String currency = "Euro";

    @Override
    public double convertToEuro(double amount) {
        return amount * 4.5;
    }

    @Override
    public double convertToUsd(double amount) {
        return amount * 4.1;
    }

    @Override
    public double getConversionRate(String currency) {
        return 0;
    }
}
