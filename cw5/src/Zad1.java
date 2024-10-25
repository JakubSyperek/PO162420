import java.util.ArrayList;

public class Zad1 {
    public static void append(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        tab1.addAll(tab2);
        System.out.println(tab1);
    }

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        b.add(4);
        b.add(3);
        append(a, b);
    }
}
