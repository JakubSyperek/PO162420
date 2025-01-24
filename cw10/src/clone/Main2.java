package clone;

public class Main2 {
    public static void main(String[] args){
        try {
            double[] initialSalaries = {3000.0, 3100.0, 3200.0, 3300.0, 3400.0, 3500.0,
                    3600.0, 3700.0, 3800.0, 3900.0, 4000.0, 4100.0};
            Employee originalEmployee = new Employee("Jan Kowalski", initialSalaries);

            Employee clonedEmployee = originalEmployee.clone();

            originalEmployee.setSalary(5, 5000.0);

            System.out.println("Oryginalny pracownik: " + originalEmployee);
            System.out.println("Sklonowany pracownik: " + clonedEmployee);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
