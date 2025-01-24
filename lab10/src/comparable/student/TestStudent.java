package comparable.student;

import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 4.5, 2000));
        students.add(new Student("Bartek", 3.8, 1999));
        students.add(new Student("Cezary", 4.9, 2001));
        students.add(new Student("Daria", 4.2, 2000));
        students.add(new Student("Ewelina", 4.7, 1998));

        System.out.println("Przed sortowaniem:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println();
        System.out.println("Po sortowaniu (malejąco według średniej ocen):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
