package comparable.client;

public class Client implements Comparable<Client> {
    private String lastName;
    private double balance;

    public Client(String lastName, double balance) {
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(Client other) {
        int balanceComparison = Double.compare(this.balance, other.balance);
        if (balanceComparison != 0) {
            return balanceComparison;
        }

        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return "Client{lastName='" + lastName + "', balance=" + balance + "}";
    }
}

//Zdefiniuj klasę Client, która będzie implementować generyczny interfejs Comparable. W
//klasie tej zadeklaruj prywatne pola lastName typu String oraz balance typu double.
//Implementując metodę compareTo interfejsu Comparable, porównuj klientów na podstawie
//ich salda, a w przypadku takiego samego salda - na podstawie nazwiska. Następnie
//zdefiniuj klasę Company dziedziczącą po klasie Client. Klasa Company ma dodatkowo posiadać
//prywatne pole numberOfEmployees typu int. Implementując metodę compareTo
//interfejsu Comparable w klasie Company, skorzystaj z metody compareTo zdefiniowanej
//w klasie Client oraz, w razie potrzeby, uwzględnij pole numberOfEmployees. Napisz
//program TestClient, w którym utwórz listę tablicową 5 klientów i firm o nazwie
//clientList posługując się klasą ArrayList. W składzie listy powinny wystąpić przynajmniej
//dwóch klientów o takim samym saldzie i różnym nazwisku oraz dwie firmy o
//takiej samej liczbie pracowników i różnym saldzie. Wyświetl zawartość listy clientList,
//posortuj ją za pomocą instancyjnej metody sort z klasy ArrayList i ponownie wyświetl
//zawartość tej listy.
