package clone;

public class Student implements Cloneable {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}


//Napisz klasę Student z trzema polami: name (String), age (int) i grade (double). Zaimplementuj
//interfejs Cloneable i nadpisz metodę clone(), aby móc klonować obiekty tej
//klasy. W metodzie main() utwórz obiekt Student, sklonuj go, a następnie zmień ocenę
//(grade) oryginalnego studenta. Wyświetl oceny obu studentów, aby zobaczyć, czy są
//niezależne.