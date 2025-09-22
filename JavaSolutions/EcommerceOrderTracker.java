import java.util.*;

class InvalidOrderException extends Exception {
    public InvalidOrderException(String msg) { super(msg); }
}

class Order {
    String product;
    int qty;
    double price;
    Order(String product, int qty, double price) throws InvalidOrderException {
        if (qty < 0 || price < 0) throw new InvalidOrderException("Invalid order values!");
        this.product = product; this.qty = qty; this.price = price;
    }
}

public class EcommerceOrderTracker {
    static List<Order> orders = new ArrayList<>();

    public static double dailyTotal() {
        double sum = 0;
        for (Order o : orders) sum += o.qty * o.price;
        return sum;
    }

    public static void main(String[] args) {
        try {
            orders.add(new Order("Laptop", 2, 50000));
            orders.add(new Order("Mouse", 5, 500));
        } catch (Exception e) { System.out.println(e.getMessage()); }
        System.out.println("Total sales: " + dailyTotal());
    }
}
