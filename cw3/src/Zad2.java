public class Zad2 {
    public static void funKwaRozwiazania(int x){
        for (int a = 1; a <= x; a++) {
            for (int b = -x; b <= x; b++) {
                for (int c = -x; c <= x; c++) {
                    int d = b * b - 4 * a * c;

                    if (d >= 0) {
                        System.out.println(a + ", " + b + ", " + c);
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        funKwaRozwiazania(1);
    }
}
