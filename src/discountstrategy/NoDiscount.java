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
public class NoDiscount implements DiscountStrategy {

    //properties
    private double discountRate;

    //constructors
    public NoDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    //methods
    @Override
    public double getDiscountProductTotal(double unitPrice, int qty) {
            return unitPrice * qty;
    }
        

    @Override
    public double getAmountSaved(double unitPrice, int qty) {
            return 0;
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
