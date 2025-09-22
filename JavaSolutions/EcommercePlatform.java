import java.util.*;

class Product {
    String name; double price; int qty;
    Product(String n,double p,int q){name=n;price=p;qty=q;}
}
class Cart {
    List<Product> items=new ArrayList<>();
    void add(Product p){ items.add(p);}
    double total(){ double s=0; for(Product p:items) s+=p.price*p.qty; return s;}
}
class User {
    String name; Cart cart=new Cart();
    User(String name){this.name=name;}
}

public class EcommercePlatform {
    public static void main(String[] args){
        User u=new User("Gaurav");
        u.cart.add(new Product("Laptop",50000,1));
        u.cart.add(new Product("Mouse",500,2));
        System.out.println("Total for "+u.name+": "+u.cart.total());
    }
}
