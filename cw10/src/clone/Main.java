package clone;

public class Main {
    public static void main(String[] args) {
        try {
            Student originalStudent = new Student("Jan Kowalski", 20, 4.5);

            Student clonedStudent = (Student) originalStudent.clone();

            originalStudent.setGrade(3.8);

            System.out.println("Oryginalny student: " + originalStudent);
            System.out.println("Sklonowany student: " + clonedStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


}
