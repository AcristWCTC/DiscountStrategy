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
public class QtyDiscount implements DiscountStrategy {

    //properties
    private double discountRate;
    private int minQty;

    //constructors
    public QtyDiscount(double discountRate, int minQty) {
        this.discountRate = discountRate;
        this.minQty = minQty;
    }

    //methods
    @Override
    public double getDiscountProductTotal(double unitPrice, int qty) {
        if (qty >= minQty) {
            return (unitPrice * qty) - getAmountSaved(unitPrice, qty);
        } else {
            return unitPrice * qty;
        }
    }

    @Override
    public double getAmountSaved(double unitPrice, int qty) {
        if (qty >= minQty) {
            return unitPrice * qty * discountRate;
        } else {
            return 0;
        }
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

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

// Class Testing 
//    public static void main(String[] args) {
//        QtyDiscount discount = new QtyDiscount(.10);
//        double amt = discount.getAmountSaved(10, 2);
//        System.out.println("Amount Saved: $" + amt);
//        double newTotal = discount.getDiscountProductTotal(10, 2);
//        System.out.println("New Total: $" +  newTotal);
//    }
}
