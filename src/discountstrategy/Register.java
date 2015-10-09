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
public class Register {

    private Receipt receipt;

    public final void addItemToSale(String prodId, int qty) {

        receipt.addProductToSale(prodId, qty);
    }

    public final void startNewSale(String customerId, DatabaseAccessStrategy fd, ReceiptOutputConsole output) {

        receipt = new Receipt(customerId, fd, output);
    }

    public final void endSale() {
        receipt.outputReceipt();
    }

}
