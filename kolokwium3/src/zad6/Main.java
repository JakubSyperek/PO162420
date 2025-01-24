package zad6;

public class Main {
    public static <T> boolean isEqualOrNull(T object1, T object2){
        if((object1 == object2) || ((object1 == null) && (object2 == null))){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        String a = null;
        String b = null;
        System.out.println(isEqualOrNull(a, b));
    }
}
