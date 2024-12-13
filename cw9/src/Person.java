public record Person(String firstPerson, String lastPerson, Address address) {


    public String PersonInfo(){
        return firstPerson + " " + lastPerson + ", " + address;
    }
}

class TestPerson{
    public static void main(String[] args){
        //Person person1 = new Person("Jakub", "Syperek", "A");
    }
}