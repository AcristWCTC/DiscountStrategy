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
public interface DiscountStrategy {

    public double getAmountSaved(double unitPrice, int qty);
    public double getDiscountRate();
    public void setDiscountRate(double discountRate);

    
}
