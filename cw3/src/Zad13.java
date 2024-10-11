public class Zad13 {
    public static void czyPalindrom(String wyraz){

        String wspak="";
        char ch;
        for(int i=0; i<wyraz.length(); i++){
            ch = wyraz.charAt(i);
            wspak = ch + wspak;
        }
        if(wyraz.equals(wspak)){
            System.out.println("Słowo " + wyraz + " jest palindromem.");
        } else {
            System.out.println("Słowo " + wyraz + " nie jest palindromem.");
        }
    }

    public static void main(String[] args){
        czyPalindrom("kaja");
    }
}
