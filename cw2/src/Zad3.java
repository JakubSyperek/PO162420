import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsze słowo: ");
        String a = scanner.nextLine();
        System.out.println("Podaj drugie słowo: ");
        String b = scanner.nextLine();

        System.out.println(a + " " + b);
    }
}
