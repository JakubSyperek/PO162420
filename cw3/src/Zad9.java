public class Zad9 {
    public static void silnia(int m, int n){
        int x=1;
        for(int i=1; i<=n; i+=m)
        {
            x=x*i;
        }
        System.out.println();
        System.out.println(x);
    }

    public static void main(String[] args){
        silnia(4, 12);
    }
}
