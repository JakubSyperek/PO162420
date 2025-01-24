package comparable.student;



public class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;
    private int yearOfBirth;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.averageGrade, this.averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}

//Napisz klasę Student, która zawiera pola: name (typu String), averageGrade (typu
//double) i yearOfBirth (typu int). Zaimplementuj interfejs Comparable w taki sposób,
//aby obiekty klasy Student były sortowane malejąco według średniej ocen. Stwórz listę
//tablicową 5 obiektów klasy Student i posortuj ją według sprecyzowanego kryterium.