/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Adam
 */
public class Product {

    //properties
    private String productId;
    private String name;
    private double unitPrice;
    private DiscountStrategy discount;

    //constructors
    public Product() {
    }

    public Product(String productId, String name, double unitPrice, DiscountStrategy discount) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    //methods
    public double getAmountSaved(int qty) {
        return discount.getAmountSaved(unitPrice, qty);
    }

    public double getDiscountProductTotal(int qty) {
        return discount.getDiscountProductTotal(unitPrice, qty);
    }

    // getters and setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    // Class Testing 
//    public static void main(String[] args) {
//        Product product = new Product("100", "Hat", 20.00, new QtyDiscount(.10, 2));
//        double amtSaved = product.getAmountSaved(2);
//        System.out.println("Amount Saved: $" + amtSaved);
//    }

}
