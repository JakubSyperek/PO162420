public class Zad16 {
    public static void czyDoskonala(int n) {
        int sumaD = 0;
        for (int i=1; i<=n/2; i++) {
            if (n % i == 0) {
                sumaD += i;
            }
        }
        if (sumaD == n) {
            System.out.println("Liczba jest doskonała.");
        } else {
            System.out.println("Liczba nie jest doskonała.");
        }
    }

    public static void main(String[] args) {
        czyDoskonala(28);
        czyDoskonala(36);
        czyDoskonala(8128);
    }
}
