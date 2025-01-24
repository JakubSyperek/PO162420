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

//Utwórz rekord Address, który zawiera street, houseNumber, postalCode i city. Następnie,
//stwórz rekord Person, który oprócz podstawowych informacji o osobie (np.
//firstName, lastName) zawiera również pole typu Address. Stwórz przypadek testowy.