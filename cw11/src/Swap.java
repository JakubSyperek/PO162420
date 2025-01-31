public class Swap {

    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Indeksy poza zakresem tablicy");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] myArray = {1, 2, 3, 4, 5};

        System.out.println("Przed zamianą:");
        for (Integer num : myArray) {
            System.out.print(num + " ");
        }

        swap(myArray, 0, 2);

        System.out.println();
        System.out.println("Po zamianie:");
        for (Integer num : myArray) {
            System.out.print(num + " ");
        }
    }
}
