package comparable.student2;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Jan Kowalski", 4.5, 2),
                new Student("Anna Nowak", 4.5, 1),
                new Student("Piotr Wiśniewski", 4.8, 3),
                new Student("Zofia Wójcik", 4.2, 2)
        };

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

//Napisz klasę Student, która zawiera pola: name (typu String), averageGrade (typu
//double) i yearOfStudy (typu int). Zaimplementuj interfejs Comparable w taki sposób,
//aby obiekty klasy Student były sortowane według jednego kryterium: malejąco według
//średniej ocen, a przy równości sortowane były rosnąco według roku studiów. Stwórz
//tablicę 4 obiektów klasy Student i posortuj ją według sprecyzowanego kryterium.