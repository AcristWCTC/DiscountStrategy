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
public class FlatDiscount implements DiscountStrategy {

    //properties
    private double discountRate;
    private double qty;

    //constructors
    public FlatDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    //methods
        

    @Override
    final public double getAmountSaved(double unitPrice, int qty) {
        
            return Math.abs(discountRate * qty);
    }
    

    //getters and setters
    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}
