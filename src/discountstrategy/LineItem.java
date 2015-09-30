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
    private int qty;

    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public LineItem() {
    }

    final public double getSubTotal(int qty) {
        return product.getDiscountProductTotal(qty);
        
    }
    
    
    
    // Class Testing 
    public static void main(String[] args) {
        Product product = new Product("100", "Hat", 20.00, new QtyDiscount(.10, 5));
        LineItem lineitem = new LineItem(product, 5);
        double subtotal = lineitem.getSubTotal(lineitem.qty);
        System.out.println(subtotal);
    }
}
