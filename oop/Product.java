package oop;

public class Product {
    private int productId;
    private String name;
    private float price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if (productId < 0)
            this.productId = Math.abs(productId);
        else
            this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < 0)
            this.price = Math.abs(price);
        else
            this.price = price;
    }

    @Override
    public String toString() {
        return   name + " -$" + price ;
    }

}
