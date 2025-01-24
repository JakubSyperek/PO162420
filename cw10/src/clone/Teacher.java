package clone;

class Teacher implements Cloneable {
    private String name;
    private int age;
    private double salary;

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

//Napisz klasę Teacher z polami name (String), age (int) i salary (double). Następnie
//napisz klasę HeadTeacher, która dziedziczy po klasie Teacher i dodaje pole bonus (double).
//Zaimplementuj interfejs Cloneable i nadpisz metodę clone() w obu klasach. W
//metodzie main() pokaż przykład prezentujący poprawność klonowania obiektów tych
//klas.