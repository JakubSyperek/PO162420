public record Address(String street, String houseNumber, String postalCode, String city) {
    public String AddressInfo(){
        return street + " " + houseNumber + ", " + postalCode + " " + city;
    }
}

//Utwórz rekord Address, który zawiera street, houseNumber, postalCode i city. Następnie,
//stwórz rekord Person, który oprócz podstawowych informacji o osobie (np.
//firstName, lastName) zawiera również pole typu Address. Stwórz przypadek testowy.