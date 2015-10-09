/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;




/**
 *
 * @author Adam
 */
public class Receipt{
    private LineItem[] items;
    private DatabaseAccessStrategy fd;
    private CustomerInterface customer;
    private static int receiptNo = 0;
    private ReceiptOutputStrategy output;


    public Receipt() {
    }

    public Receipt(String customerId, DatabaseAccessStrategy fd, ReceiptOutputConsole output) {
        this.setFd(fd);
        this.customer = setCustomer(customerId);
        receiptNo++;
        items = new LineItem[0];
        this.output = output;
    }
    
    //ASK JIM!!!!!!!!!!!!!!!!!!!!!!!!
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
    
    public final CustomerInterface setCustomer(String CustomerId){
        return fd.findCustomer(CustomerId);
           

    }
    
        public final double getTotalBeforeDiscount() {
        double total = 0.0;
        for(LineItem item : items) {
            total += item.getSubTotal();
        }
        return total;
    }
        
    public final double getTotalDiscount() {
        double total = 0.0;
        for(LineItem item : items) {
            total += item.getDiscountAmt();
        }
        return total;
    }
    

    
    public void addProductToSale(String productId, int qty) {
            LineItem [] temp = new LineItem[items.length + 1];
            Product p = new Product();
            p = fd.findProduct(productId);
            LineItem line = new LineItem(fd, p, qty);
            
            for(int i = 0; i < items.length; i++){
            temp[i] = items[i];
        }
        temp[temp.length-1] = line;
        items = temp;
        temp = null;
        
    }

    public void setFd(DatabaseAccessStrategy fd) {
        this.fd = fd;
    }
        
        
        public final void outputReceipt() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        final String CRLF = "\n";
        final String CRLF2 = "\n\n";
        
        // Build header
        StringBuilder receiptData = new StringBuilder("Thank you for shopping at Kohls!\n\n");
        receiptData.append("Sold to: ").append(customer.getName()).append(CRLF);
        receiptData.append("Receipt No.: " ).append(Receipt.receiptNo).append(CRLF2);
        
        // Now process line items
        receiptData.append("ID\tItem\t\t\tPrice\tQty\tSubtotal\tDiscount").append(CRLF);
        receiptData.append("------------------------------------------------------------------------").append(CRLF);
        for(LineItem item : items) {
            receiptData.append(item.getProduct().getProductId()).append("\t");
            receiptData.append(item.getProduct().getName()).append("\t");
            receiptData.append(nf.format(item.getProduct().getUnitPrice())).append("\t");
            receiptData.append(item.getQty()).append("\t");
            receiptData.append(nf.format(item.getSubTotal())).append("\t\t");
            receiptData.append(nf.format(item.getDiscountAmt())).append(CRLF);
        }
        
        // Now process totals
        receiptData.append(CRLF);
        receiptData.append("\t\t\t\t\t\t\t\t--------").append(CRLF);
        double totalNet = getTotalBeforeDiscount();
        receiptData.append("\t\t\t\t\t\tNet Total: \t").append(nf.format(totalNet)).append(CRLF);
        double totalDiscount = getTotalDiscount();
        receiptData.append("\t\t\t\t\t\tTotal Saved: \t-").append(nf.format(totalDiscount)).append(CRLF);
        double totalDue = totalNet - totalDiscount;
        receiptData.append("\t\t\t\t\t\tTotal Due: \t").append(nf.format(totalDue)).append(CRLF);
        
        // Now generate data string...
        // Notice that the format is hardcoded into this method. We could do
        // better by using a format strategy in the future.
        output.outputReceipt(receiptData.toString());
    
    }
    
    

}
    

