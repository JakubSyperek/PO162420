import java.util.ArrayList;
import java.util.List;

class Box<T>{
    T obiekt;

    public void setObiekt(T obiekt){
        this.obiekt = obiekt;
    }

    public T getObiekt(){
        return obiekt;
    }
}

class Counter<T>{
    List<T> lista = new ArrayList<T>();

    public void add(T objekt){
        lista.add(objekt);
    }

    public int getCount(){
        return lista.size();
    }
}



public class TestPunkt {

    public static <T> boolean isEqual(T a, T b){
        return a.equals(b);
    }

    public static void main(String[] args){
        Box<String> b1 = new Box<>();
        b1.setObiekt("1357");

        System.out.println(b1.getObiekt());

        Box<Integer> b2 = new Box<>();
        b2.setObiekt(1357);
        System.out.println(b2.getObiekt());

        System.out.println(isEqual(b1.getObiekt(), b2.getObiekt()));
    }


}

//1. Stwórz prostą klasę generyczną Box, która może przechowywać obiekt dowolnego typu.
//Klasa powinna zawierać metodę set, aby ustawić obiekt, oraz metodę get, aby go pobrać.
//2. Napisz generyczną metodę isEqual, która przyjmuje dwa dowolne obiekty tego samego
//typu i zwraca true, jeśli są one równe, w przeciwnym razie false.
//3. Stwórz klasę generyczną Counter<T>, która będzie zliczać ilość dodanych elementów
//określonego typu. Klasa powinna mieć metodę add(T element), która dodaje element
//do wewnętrznej struktury, oraz metodę getCount(), która zwraca liczbę dodanych elementów.