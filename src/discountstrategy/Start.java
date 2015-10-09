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
public class Start {


    public static void main(String[] args) {
        Register r = new Register();
        
        // Customer #1 sale
        r.startNewSale("100", new FakeDatabase(), new ReceiptOutputConsole());
        r.addItemToSale("B100", 2);
        r.addItemToSale("A100", 1);
        r.endSale();
        
        // Customer #2 sale
        r.startNewSale("101", new FakeDatabase(), new ReceiptOutputConsole());
        r.addItemToSale("C100", 4);
        r.addItemToSale("D100", 6);
        r.endSale();
        
        

    }
}