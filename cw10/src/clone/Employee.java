package clone;

import java.util.Arrays;

public class Employee implements Cloneable {
    private String name;
    private double[] salaries;

    public Employee(String name, double[] salaries) {
        this.name = name;
        this.salaries = Arrays.copyOf(salaries, salaries.length);
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalary(int month, double salary) {
        if (month >= 0 && month < 12) {
            this.salaries[month] = salary;
        } else {
            throw new IllegalArgumentException("Błędny miesiąc");
        }
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.salaries = Arrays.copyOf(this.salaries, this.salaries.length);
        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaries=" + Arrays.toString(salaries) +
                '}';
    }
}


//Napisz klasę Employee z dwoma polami: name (String) i salaries (tablica 12 zmiennych
//typu double, reprezentująca zarobki za każdy miesiąc). Zaimplementuj interfejs
//Cloneable i nadpisz metodę clone(), aby móc klonować obiekty tej klasy. W metodzie
//main() utwórz obiekt Employee, sklonuj go, a następnie zmień zarobki na pozycji 5
//(czerwiec) oryginalnego pracownika. Wyświetl zarobki obu pracowników, aby zobaczyć,
//czy są niezależne.