public class Zad10 {
    public static void dwumianNewtona(int n, int k){
        if(n>k) {
            int n1 = 1;
            for (int i = 1; i <= n; i++) {
                n1 = n1 * i;
            }

            int k1 = 1;
            for (int i = 1; i <= k; i++) {
                k1 = k1 * i;
            }

            int nk1 = 1;
            for (int i = 1; i <= (n - k); i++) {
                nk1 = nk1 * i;
            }

            int newton = ((n1) / (k1 * nk1));
            System.out.println("(" + n + ", " + k + ") = " + newton);
        }
    }
    public static void main(String[] args){

        dwumianNewtona(14, 9);
    }
}
