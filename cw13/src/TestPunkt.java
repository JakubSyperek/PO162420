
import java.util.*;

public class TestPunkt {

    //A1
    public static <T> void printUnique(Collection<T> items){
        Set<T> uniqueElements = new HashSet<>(items);

        for(T item: uniqueElements){
            System.out.println(item);
        }
    }
    //C1
    public <T> ArrayList<T> mergeLists(ArrayList<T> first, ArrayList<T> second){
        ArrayList<T> merged = new ArrayList<>();
        merged.addAll(first);
        merged.addAll(second);

        return merged;
    }
    //B1
    public static <T> void reversePrint(Iterable<T> items){
        ArrayList<T> tempList = new ArrayList<>();

        for(T item : items){
            tempList.add(item);
        }

        for(int i=tempList.size()-1; i>=0; i--){
            System.out.println(tempList.get(i));
        }
    }

    //D1
    public static <T> boolean isPalindrome(LinkedList<T> list){
        int left = 0;
        int right = list.size()-1;

        while (left<right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

    //F1
    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> list, T lowerBound, T upperBound){
        return (TreeSet<T>) list.subSet(lowerBound, true, upperBound, true);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("b");
        list2.add("a");

        printUnique(list);
        printUnique(list2);

        reversePrint(list);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(8);
        list3.add(1);
        System.out.println(isPalindrome(list3));

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        System.out.println(findElementsInRange(tree, 2, 5));
    }
}
