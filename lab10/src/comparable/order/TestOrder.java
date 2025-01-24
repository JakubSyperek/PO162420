package comparable.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrder {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Laptop", 3, 2500.00));
        orders.add(new Order("Telefon", 10, 800.00));
        orders.add(new Order("Tablet", 5, 1200.00));
        orders.add(new Order("Monitor", 2, 350.00));

        Collections.sort(orders);

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
