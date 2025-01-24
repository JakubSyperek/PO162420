
class Person2 implements Comparable<Person2> {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person2 other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person2{name='" + name + "', age=" + age + "}";
    }
}

public class MinValue {

    public static <T extends Comparable<T>> T minValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        T min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 3, 7};
        System.out.println("Najmniejszy element w tablicy Integer: " + minValue(intArray));

        Double[] doubleArray = {3.5, 1.2, 7.8, 4.4, 2.1};
        System.out.println("Najmniejszy element w tablicy Double: " + minValue(doubleArray));

        String[] stringArray = {"apple", "orange", "banana", "kiwi"};
        System.out.println("Najmniejszy element w tablicy String: " + minValue(stringArray));

        Person2[] personArray = {
                new Person2("John", 25),
                new Person2("Alice", 22),
                new Person2("Bob", 30),
                new Person2("Charlie", 20)
        };
        System.out.println("Najmniejszy element w tablicy Person: " + minValue(personArray));
    }
}


//Napisz statyczną metodę generyczną minValue, która przyjmuje tablicę elementów typu
//generycznego T, gdzie T rozszerza Comparable<T>. Metoda powinna zwracać najmniejszy
//element z tablicy. Przetestuj tę metodę na tablicach zawierających różne typy porównywalnych
//obiektów, takie jak Integer, Double, czy String. Zabezpiecz metodę tak, aby
//nie można było jej wywołać z tablicą o zerowej liczbie elementów. Dodaj klasę Person z
//polami name i age i przetestuj metodę minValue na tablicy obiektów Person.