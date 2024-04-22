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
public class Cart {
    private int customerId;
    private int nProduct;
    private ArrayList<Product> products = new ArrayList<>();

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerid) {
        this.customerId = customerid;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getnProduct() {
        return nProduct;
    }

    public void setnProduct(int nProduct) {
        if (nProduct < 0)
            this.nProduct = Math.abs(nProduct);
        else
            this.nProduct = nProduct;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(Product p) {
        for (int i = 0; i < nProduct; i++) {
            if (p.getProductId() == products.get(i).getProductId());
            products.remove(i);

        }

    }

    public float calculatePrice() {
        float totalPrice = 0;
        for (int i = 0; i < nProduct; i++) {
            totalPrice += products.get(i).getPrice();
        }
        return totalPrice;
    }

    public boolean placeOrder(int place) {
        if (place == 1)
            return true;
        else
            return false;

    }
    
}
