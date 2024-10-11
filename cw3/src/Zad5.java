public class Zad5 {
    public static void liczbyPodzielne(int m, int n){
        int start = (int) Math.pow(10, m - 1);
        int end = (int) Math.pow(10, m) - 1;


        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        liczbyPodzielne(3, 79);
    }
}
