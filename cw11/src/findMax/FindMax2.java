package findMax;

class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Animal{age=" + age + "}";
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(int age, String breed) {
        super(age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{age=" + getAge() + ", breed='" + breed + "'}";
    }
}

public class FindMax2 {
    public static <T extends Animal> T findMax(T element1, T element2) {
        if (element1.getAge() > element2.getAge()) {
            return element1;
        } else {
            return element2;
        }
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal(5);
        Animal animal2 = new Animal(7);
        Dog dog1 = new Dog(3, "Doberman");
        Dog dog2 = new Dog(4, "Bulldog");

        Animal olderAnimal = findMax(animal1, animal2);
        System.out.println("Starsze zwierzę: " + olderAnimal);

        Dog olderDog = findMax(dog1, dog2);
        System.out.println("Starszy pies: " + olderDog);

        Animal maxAnimal = findMax(animal1, dog1);
        System.out.println("Starszy obiekt (Animal vs Dog): " + maxAnimal);
    }
}


//Utwórz dwie klasy: Animal (Zwierzę) i Dog (Pies), gdzie Dog dziedziczy po Animal. Następnie
//napisz statyczną metodę generyczną findMax, która przyjmuje dwa argumenty:
//element1 i element2 typu extends Animal. Metoda powinna zwracać element większy
//według własnie zdefiniowanego kryterium porównania. W implementacji porównaj
//elementy bazując na wybranym przez siebie atrybucie, na przykład wieku.