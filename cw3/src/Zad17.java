public class Zad17 {
    public static void czyPier(int n) {
        for(int i=1; i<=n; i++){
            if(n % i != 0){
                System.out.println("Liczba jest pierwsza.");
            }
            else {
                System.out.println("Liczba nie jest pierwsza");
            }
        }
    }
    public static void main(String[] args) {
        czyPier(37);
    }
}
