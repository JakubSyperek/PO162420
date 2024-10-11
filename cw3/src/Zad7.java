public class Zad7 {
    public static void silnia(int n){
        int x=1;
        for(int i=1; i<=n; i++)
        {
            x=x*i;
        }
        System.out.println(x);
    }

    public static void main(String[] args){
        silnia(6);
    }
}
