import java.util.Arrays;

public class Zad1 {
    public static void generujTablice(int n, int minWartosc, int maxWartosc){
        int[] arr = new int[n];
        for(int i=0; i<maxWartosc-minWartosc+1; i++)
        {
            arr[i] = i+minWartosc;

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args){
        generujTablice(11, 20, 30);
    }
}
