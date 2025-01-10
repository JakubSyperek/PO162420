class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }
}


public class TestAnimal {
    public static <T extends Animal> T findMax(T element1, T element2){
        return element1.getAge() > element2.getAge() ? element1 : element2;
    }
    public static void main(String[] args){
        Animal a1 = new Animal("Pimpek", 2);
        Dog dog = new Dog("Reksio", 3);

        Animal maks = findMax(a1, dog);
        System.out.println(maks);
    }

}
