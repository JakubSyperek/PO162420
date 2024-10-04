import static java.lang.Math.sqrt;

public class Zad2 {
    public static void main(String[] args) {
        double a = ((sqrt(7)-1)/2) + (Math.pow(3, 2)%2);
        int ia = (int) a;
        System.out.println(ia);

        float b = (float) 2001 /(30 * 8);
        int ib = (int) b;
        System.out.println(ib);

        float c = (float) ((3+sqrt(3))/((sqrt(5)/2)/3))+1;
        int ic = (int) c;
        System.out.println(ic);

        float d = (float) 1000%47%10;
        int id = (int) d;
        System.out.println(id);

        float e = (float) (((7%5) + 1)/Math.pow(2, 0.25));
        int ie = (int) e;
        System.out.println(ie);
    }
}
