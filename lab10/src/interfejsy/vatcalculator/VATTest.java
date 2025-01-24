package interfejsy.vatcalculator;

public class VATTest {
    public static void main(String[] args) {
        double productPrice = 100.0;

        double priceWithVAT = VATCalculator.calculateWithVAT(productPrice);

        System.out.println("Cena produktu: " + productPrice);
        System.out.println("Cena z VAT: " + priceWithVAT);
    }
}
