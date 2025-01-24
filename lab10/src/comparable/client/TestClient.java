package comparable.client;

import java.util.*;

public class TestClient {
    public static void main(String[] args) {
        List<Client> clientList = new ArrayList<>();
        clientList.add(new Client("Kowalski", 1000.00));
        clientList.add(new Client("Nowak", 1500.00));
        clientList.add(new Client("Kowalski", 1000.00));
        clientList.add(new Company("TechCorp", 2000.00, 50));
        clientList.add(new Company("Innovations", 2000.00, 100));

        System.out.println("Przed sortowaniem:");
        for (Client client : clientList) {
            System.out.println(client);
        }

        Collections.sort(clientList);

        System.out.println();
        System.out.println("Po sortowaniu:");
        for (Client client : clientList) {
            System.out.println(client);
        }
    }
}
