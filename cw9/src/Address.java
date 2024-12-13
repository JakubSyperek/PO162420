public record Address(String street, String houseNumber, String postalCode, String city) {
    public String AddressInfo(){
        return street + " " + houseNumber + ", " + postalCode + " " + city;
    }
}

