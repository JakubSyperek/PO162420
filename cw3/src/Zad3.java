
public class Zad3 {
    public static void funKwaDelta(int x){
        for (int a = 1; a <= x; a++) {
            for (int b = -x; b <= x; b++) {
                for (int c = -x; c <= x; c++) {
                    int d = b * b - 4 * a * c;

                    if (d >= 0) {
                        int pd = (int) Math.sqrt(d);
                        if(pd * pd == d){
                            System.out.println(a + ", " + b + ", " + c);
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        funKwaDelta(3);
    }
}
