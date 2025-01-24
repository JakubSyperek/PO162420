package exception;

public class Main {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Wiek musi być większy lub równy 18 lat.");
        }
        System.out.println("Wiek jest poprawny: " + age + " lat.");
    }

    public static void main(String[] args) {
        int[] agesToCheck = {16, 18, 20, 15, 25};

        for (int age : agesToCheck) {
            try {
                checkAge(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Błąd: " + e.getMessage() + " Podano wiek: " + age);
            }
        }
    }
}

//Napisz program, który definiuje metodę checkAge(int age). Metoda ta powinna rzucić
//wyjątek IllegalArgumentException z odpowiednim komunikatem, jeśli podany wiek
//jest mniejszy niż 18. W głównej metodzie programu (main) wywołaj checkAge z różnymi
//wartościami i obsłuż wyjątek, wyświetlając stosowny komunikat dla użytkownika.
