import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj  liczbę: ");
        int a = scanner.nextInt();

        System.out.println(a + " + 140 = " + (a+140));
        System.out.println(a + " -31 = " + (a-31));
        System.out.println(a + " * 7 = " + (a*7));
        System.out.println(a + " / 13 = " + (a/13));
        System.out.println(a + " % 7 = " + (a%7));
        System.out.println(a + " / 4 = " + (int)(a/4));
        System.out.println(a + " ^ 45 = " + (Math.pow(a,45)));
        System.out.println(a + " & 67 = " + (a&67));
        System.out.println(a + " | 59 = " + (a|59));
        System.out.println(a + " ^ 23 = " + (a^23));
        System.out.println(a + " << 5 = " + (a<<5));
        System.out.println(a + " >> 6 = " + (a>>6));
    }
}
