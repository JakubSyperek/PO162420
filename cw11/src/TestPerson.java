class Pair<T>{
    private T first;
    private T second;

    public Pair(){}

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}

class Animal1{
    private String name;

    public Animal1(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


}

class Dog1 extends Animal1{
    private int age;

    public Dog1(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class TestPerson{
    public static void findMinMaxAge(Dog1[] dogs, Pair<? super Dog1> result){
        Dog1 minAgeDog = dogs[0];
        Dog1 maxAgeDog = dogs[0];

        for (Dog1 dog : dogs){
            if(dog.getAge() < minAgeDog.getAge()){
                minAgeDog = dog;
            }

            if(dog.getAge() > maxAgeDog.getAge()){
                maxAgeDog = dog;
            }
            result.setFirst(minAgeDog);
            result.setSecond(maxAgeDog);
        }


    }

    public static void main(String[] args){
        Dog1[] dogs = {
                new Dog1("Pimpek", 2),
                new Dog1("Reksio", 3),
                new Dog1("Brutus", 5)
        };
        Pair<Animal1> result = new Pair<>();
        findMinMaxAge(dogs, result);

        Dog1 youngest = (Dog1) result.getFirst();
        Dog1 oldest = (Dog1) result.getSecond();

        System.out.println(youngest.getName() + ", " + youngest.getAge());
        System.out.println(oldest.getName() + ", " + oldest.getAge());

    }
}


//Stwórz klasę generyczną Pair<T> która przechowuje dwa obiekty tego samego typu.
//Utwórz dwie klasy: Animal (Zwierzę) i Dog (Pies), gdzie Dog dziedziczy po Animal.
//Klasa Dog ma posiadać prywatne pole age, które nie posiada klasa Animal. Następnie
//napisz statyczną metodę generyczną findMinMaxAge, która przyjmuje jako argument tablicę
//obiektów typu Dog oraz Pair<?super Dog> result. Metoda powinna ma zapisać
//(jako obiekty typu Dog) najmniejszy i najmniejszy (pod kątem wieku) psa z tablicy w
//drugim argumencie metody. Zrób to bezpośrednio bez używania interfejsów Comparable
//czy Comparator.