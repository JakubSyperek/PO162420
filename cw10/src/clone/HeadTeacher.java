package clone;

public class HeadTeacher extends Teacher {
    private double bonus;

    public HeadTeacher(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        HeadTeacher cloned = (HeadTeacher) super.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "HeadTeacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                '}';
    }
}