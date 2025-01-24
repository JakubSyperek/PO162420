package interfejsy.animal;

public interface AnimalSound {
    String makeSound();
}

//Stwórz interfejs AnimalSound z jedną metodą makeSound().
//• Rozszerz ten interfejs, tworząc interfejs DomesticAnimalSound, który dodaje metodę
//makeHappySound().
//• Stwórz klasę Dog, która implementuje DomesticAnimalSound. Metoda makeSound()
//powinna zwracać string “Woof”, a makeHappySound() - “Wag tail”.
//• W osobnej klasie testującej (TestAnimals), utwórz obiekt Dog i wywołaj obie metody.