package oop;

import java.lang.reflect.Array;
import java.util.*;

public class Cart {
    private int counter = 0;
    private int customerId;
    private int nProduct;
     Product[] products ;

    public int getCustomerId() {
        return customerId;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setCustomerId(int customerid) {
        this.customerId = customerid;
    }

    public int getnProduct() {
        return nProduct;
    }

    public void setnProduct(int nProduct) {
            this.nProduct = Math.abs(nProduct);
            products = new Product[nProduct];
        
    }

    public void addProduct(Product p) {
        products[counter] = p;
        counter++;

    }

    public void removeProduct(Product p) {
        Product[] products2 = new Product[getnProduct() - 1];
        int indexRemoved = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == p.getProductId()) {
                indexRemoved = i;
                break;
                
            }
        }
        int p2=0;
        for (int i = 0; i < products.length; i++) {
            if (i != indexRemoved) {
                products2[p2] = products[i];
                p2++;
            }
               
            
        }
        setnProduct(getnProduct()-1);
        setProducts(products2);

    }

    public float calculatePrice() {
        float totalPrice = 0;
        for (int i = 0; i < nProduct; i++) {
            totalPrice += products[i].getPrice();
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
