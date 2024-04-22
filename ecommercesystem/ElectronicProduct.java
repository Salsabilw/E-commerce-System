/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author salsa
 */
public class ElectronicProduct extends Product {
     private String brand;
    private int warrantyPeriod;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if (warrantyPeriod < 0)
            this.warrantyPeriod = Math.abs(warrantyPeriod);
        else
            this.warrantyPeriod = warrantyPeriod;
    }
    
}
