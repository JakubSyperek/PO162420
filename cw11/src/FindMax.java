class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
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
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class FindMax {

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

        Person[] personArray = {
                new Person("Jan", 25),
                new Person("Alicja", 22),
                new Person("Robert", 30),
                new Person("Marcin", 20)
        };
        System.out.println("Najmniejszy element w tablicy Person: " + minValue(personArray));
    }
}
