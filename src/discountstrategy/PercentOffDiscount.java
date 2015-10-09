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
public class PercentOffDiscount implements DiscountStrategy {

    //properites

    private double discountRate;

    public PercentOffDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    //methods
    @Override
    final public double getAmountSaved(double unitPrice, int qty) {
        return unitPrice * qty * discountRate;
    }


    // getters and setters
    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

// Class Testing 
//    public static void main(String[] args) {
//        DiscountStrategy discount = new PercentOffDiscount(.10);
//        double amt = discount.getAmountSaved(10, 2);
//        System.out.println("Amount Saved: $" + amt);
//        double newTotal = discount.getDiscountProductTotal(10, 2);
//        System.out.println("New Total: $" +  newTotal);
//    }
}
