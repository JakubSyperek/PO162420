public class Zad8 {
    public static void silniaPodwojna(int n){
        int x=1;
        for(int i=1; i<=n; i+=2)
        {
            x=x*i;
        }
        System.out.println();
        System.out.println(x);
    }

    public static void main(String[] args){
        silniaPodwojna(7);
    }
}
