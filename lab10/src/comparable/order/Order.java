package comparable.order;

public class Order implements Comparable<Order> {
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public int compareTo(Order other) {
        int priceComparison = Double.compare(other.unitPrice, this.unitPrice);
        if (priceComparison != 0) {
            return priceComparison;
        }

        return Integer.compare(this.quantity, other.quantity);
    }

    @Override
    public String toString() {
        return "Order{productName='" + productName + "', quantity=" + quantity + ", unitPrice=" + unitPrice + "}";
    }
}

//Napisz klasę Order, która zawiera pola: productName (typu String), quantity (typu
//int) i unitPrice (typu double). Zaimplementuj interfejs Comparable w taki sposób,
//aby obiekty klasy Order były sortowane według jednego kryterium: malejąco według
//ceny jednostkowej, a przy równości sortowane były rosnąco według ilości. Stwórz listę
//tablicową 4 obiektów klasy Order i posortuj ją według sprecyzowanego kryterium.