

public class Main {
    public static void main(String[] args) {
        Elf e1 = new Elf("Tomek", 200, "Menedżer");
        Elf e2 = new Elf("Grzesiek", 400, "Pracownik");
        Elf e3 = new Elf("Rysiek", 300, "Pracownik");

        e1.przedstawSie();
        e2.przedstawSie();
        e3.przedstawSie();

        System.out.println(e1.hashCode());
        System.out.println(e2.equals(e1));
        System.out.println(e3.toString());
        System.out.println(e1.getImie());


    }
}