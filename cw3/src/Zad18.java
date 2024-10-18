public class Zad18 {
    public static void NWD(int a, int b){
        if(a>=b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println("NWD: " + a);
        }else{
            while (a != 0) {
                int temp = a;
                a = b % a;
                b = temp;
            }
            System.out.println("NWD: " + b);
        }
    }
    public static void main(String[] args){
        NWD(30,40);
    }
}
