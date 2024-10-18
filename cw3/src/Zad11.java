public class Zad11 {
    public static void ciagFibonacciego(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int m = a + b;
            a = b;
            b = m;
        }
    }

    public static void main(String[] args) {
        ciagFibonacciego(12);
    }
}
