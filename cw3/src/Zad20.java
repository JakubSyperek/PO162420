public class Zad20 {

    public static void podzbiory(int[] tab) {
        int n = tab.length;
        int liczbaPodzbiorow = 1 << n;

        for (int i = 0; i < liczbaPodzbiorow; i++) {
            System.out.print("{");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(tab[j] + " ");
                }
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3};
        podzbiory(tab);
    }
}
