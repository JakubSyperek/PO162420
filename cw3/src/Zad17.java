public class Zad17 {
    public static void czyPierwsza(int n) {
        if (n <= 1) {
            System.out.println("Liczba nie jest pierwsza.");
            return;
        }

        boolean lp = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                lp = false;
                break;
            }
        }

        if (lp) {
            System.out.println("Liczba jest pierwsza.");
        } else {
            System.out.println("Liczba nie jest pierwsza.");
        }
    }

    public static void main(String[] args) {
        czyPierwsza(37);
    }
}
