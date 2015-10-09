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
    private DatabaseAccessStrategy fd;

    public LineItem(DatabaseAccessStrategy fd, Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public LineItem() {
    }
    
    final public Product findProduct(String ProductId){
        return fd.findProduct(ProductId);
    }
    

    final public double getSubTotal() {
        return product.getUnitPrice();
        
    }
    public final double getDiscountAmt() {
        return product.getDiscount().getAmountSaved(product.getUnitPrice(), qty);
    }

    public Product getProduct() {
        return product;
    }
    

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    
    
    
    // Class Testing 

}