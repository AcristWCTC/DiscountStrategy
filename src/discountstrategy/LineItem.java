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
public class LineItem {

    private Product product;
    private double subtotal;

    public LineItem(Product product) {
        this.product = product;
    }

    public LineItem() {
    }

    public double getSubTotal(int qty) {
        subtotal = product.getDiscountProductTotal(qty);
        return subtotal;
    }
    
    
    
    // Class Testing 
    public static void main(String[] args) {
        Product product = new Product("100", "Hat", 20.00, new QtyDiscount(.10, 2));
        LineItem lineitem = new LineItem(product);
        double subtotal = lineitem.getSubTotal(2);
        System.out.println(subtotal);
    }
}
