public class Zad6 {
    public static void piramida(int n, String variant){
        if(variant.equals("1")) {
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (variant.equals("2")) {
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(i >= j)
                        System.out.print("*");
                }
                System.out.println();
            }

        }

    }
    public static void main(String[] args){
        piramida(5, "2");
    }
}
