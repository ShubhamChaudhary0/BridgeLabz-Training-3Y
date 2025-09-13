package com.bridgelabz.oops.inbuiltfunction;
public class Product {
   private static double discount = 0.0;
   private final String productID;
   private String productName;
   private double price;
   private int quantity;
   public Product(String productID, String productName, double price, int quantity) {
       this.productID = productID;
       this.productName = productName;
       this.price = price;
       this.quantity = quantity;
   }
   public static void updateDiscount(double newDiscount) {
       if (newDiscount >= 0.0 && newDiscount <= 100.0) {
           discount = newDiscount;
       }
   }
   public double getDiscountedPrice() {
       return price - (price * discount / 100);
   }
   public void displayProductDetails() {
       if (this instanceof Product) {
           System.out.println("Product ID: " + productID);
           System.out.println("Product Name: " + productName);
           System.out.println("Price: $" + price);
           System.out.println("Quantity: " + quantity);
           System.out.println("Discount: " + discount + "%");
           System.out.println("Price after Discount: $" + getDiscountedPrice());
       }
   }
   public static void main(String[] args) {
       Product.updateDiscount(10.0);
       Product product1 = new Product("P001", "Laptop", 1200.00, 5);
       Product product2 = new Product("P002", "Smartphone", 800.00, 10);
       product1.displayProductDetails();
       System.out.println();
       product2.displayProductDetails();
   }
}
