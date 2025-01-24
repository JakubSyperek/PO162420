package clone;

public class Main3 {
    public static void main(String[] args) {
        try {
            Teacher teacher = new Teacher("Jan Kowalski", 40, 5000.0);
            Teacher clonedTeacher = (Teacher) teacher.clone();

            HeadTeacher headTeacher = new HeadTeacher("Anna Nowak", 45, 7000.0, 2000.0);
            HeadTeacher clonedHeadTeacher = (HeadTeacher) headTeacher.clone();

            teacher.setSalary(5500.0);
            headTeacher.setBonus(2500.0);

            System.out.println("Oryginalny nauczyciel: " + teacher);
            System.out.println("Sklonowany nauczyciel: " + clonedTeacher);
            System.out.println("Oryginalny dyrektor: " + headTeacher);
            System.out.println("Sklonowany dyrektor: " + clonedHeadTeacher);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}