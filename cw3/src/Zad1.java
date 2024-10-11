public class Zad1 {
    public static void trojkiPitagorejskie(int n){
        for(int a=1; a<=n; a++){
            for(int b = a; b <= n; b++){
                int c2 = a * a + b * b;
                int c = (int) Math.sqrt(c2);

                if(c * c == c2 && c <= n){
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }
    }

    public static void main(String[] args){
        trojkiPitagorejskie(30);
    }
}
