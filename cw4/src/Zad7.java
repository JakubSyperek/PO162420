import java.util.Arrays;

public class Zad7 {
    public static void generujZakres(int n, double minWartosc, double maxWartosc){
        double[] arr = new double[n];
        double x = (maxWartosc - minWartosc) / (n-1);
        for(int i=0; i<n; i++)
        {
            arr[i] = minWartosc + (x*i) ;

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args){
        generujZakres(12, 1, 6);
    }
}
