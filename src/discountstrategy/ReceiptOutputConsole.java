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
public class ReceiptOutputConsole implements ReceiptOutputStrategy{

        @Override
        public void outputReceipt(String output) {
        System.out.println(output);
    }

}
    

