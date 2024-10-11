public class Zad4 {
    public static void liczbyPierwsze(int n) {
        for (int i = 2; i <= n; i++) {
            boolean czyPierwsza = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    czyPierwsza = false;
                    break;
                }
            }

            if (czyPierwsza) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        liczbyPierwsze(30);
    }
}
