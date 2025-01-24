package comparable.student2;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;
    private int yearOfStudy;

    public Student(String name, double averageGrade, int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public int compareTo(Student other) {
        int gradeComparison = Double.compare(other.averageGrade, this.averageGrade);
        if (gradeComparison != 0) {
            return gradeComparison;
        }

        return Integer.compare(this.yearOfStudy, other.yearOfStudy);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', averageGrade=" + averageGrade + ", yearOfStudy=" + yearOfStudy + "}";
    }


}
