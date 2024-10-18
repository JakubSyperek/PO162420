public class Zad12 {
    public static void sumaNaturalnych(int n) {
        int suma = 0;
        for(int i=1; i<=n; i++){
            suma += i;

        }
        System.out.println("Suma: " + suma);
    }

    public static void sumaParzystych(int n) {
        int sumaP = 0;
        for(int i=2; i<=n; i+=2){
            sumaP += i;

        }
        System.out.println("Suma: " + sumaP);
    }

    public static void sumaNieparzystych(int n) {
        int sumaN = 0;
        for(int i=1; i<=n; i+=2){
            sumaN += i;

        }
        System.out.println("Suma: " + sumaN);
    }

    public static void sumaKwaNaturalnych(int n) {
        int sumaKN = 0;
        for(int i=1; i<=n; i++){
            sumaKN += (i*i);

        }
        System.out.println("Suma: " + sumaKN);
    }

    public static void sumaSzeNaturalnych(int n) {
        int sumaSN = 0;
        for(int i=1; i<=n; i++){
            sumaSN += (i*i*i);

        }
        System.out.println("Suma: " + sumaSN);
    }

    public static void sumaOdwNaturalnych(int n) {
        double sumaON = 0;
        for(int i=1; i<=n; i++){
            sumaON += ((double) 1 /i);

        }
        System.out.println("Suma: " + sumaON);
    }

    public static void main(String[] args){
        sumaNaturalnych(6);
        sumaParzystych(10);
        sumaNieparzystych(10);
        sumaKwaNaturalnych(3);
        sumaSzeNaturalnych(3);
        sumaOdwNaturalnych(5);
    }
}
