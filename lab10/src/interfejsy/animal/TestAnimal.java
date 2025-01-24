package interfejsy.animal;

public class TestAnimal {
    public static void main(String[] args) {
        DomesticAnimalSound dog = new Dog();

        System.out.println("Dźwięk psa: " + dog.makeSound());
        System.out.println("Dźwięk szczęśliwego psa: " + dog.makeHappySound());
    }
}
