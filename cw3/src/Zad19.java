import java.util.Scanner;

public class Zad19 {

    public static int[] wczytajTablice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n (rozmiar tablicy): ");
        int n = scanner.nextInt();
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }
        return tablica;
    }

    public static void main(String[] args) {
        int[] wczytanaTablica = wczytajTablice();
        System.out.println("Wczytane liczby:");
        for (int liczba : wczytanaTablica) {
            System.out.println(liczba);
        }
    }
}
