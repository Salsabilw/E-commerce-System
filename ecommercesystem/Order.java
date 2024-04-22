/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author salsa
 */
import java.util.ArrayList;
public class Order {
    private int customerId;
    private static int orderId = 0;
    private int nProduct;
    private ArrayList<Product> products = new ArrayList<>();
    private float totalPrice;

    public Order() {
        orderId++;
    }

    public int getCustomerId() {
        return customerId;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void printOrderInfo() {
        System.out.println("Here's your order's summary ");
        System.out.println("order id: " + orderId);
        System.out.println("customer's id: " + getCustomerId());
        System.out.println("Products: ");
     for (Product product : products) {
        System.out.println(product.getName()+" -$" +product.getPrice());
     }
        System.out.println("Total price: $" + getTotalPrice());

    }

  
}
