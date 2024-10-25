import java.util.ArrayList;
import java.util.List;

public class Zad7 {
    public static ArrayList<Integer> uniqueArrayList(ArrayList<Integer> tab){
        List<ArrayList<Integer>> tab2 = new ArrayList<>();
        tab2.add(tab);
        for(int i=0; i<tab.size(); i++){
            for(int j=0; j<tab.size(); j++)
                tab2.get(i).add(0);
        }
        return null;
    }

    public static void main(String[] args){
        ArrayList<Integer> tablica = new ArrayList<>();
        tablica.add(1);
        tablica.add(2);
        tablica.add(3);

        uniqueArrayList(tablica);
    }
}
