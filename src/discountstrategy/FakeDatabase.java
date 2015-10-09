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
public class FakeDatabase implements DatabaseAccessStrategy{
    
        private Product[]  products = {
        new Product("A100", "MLB Brewer's Hat ", 19.95, new PercentOffDiscount(0.20)),
        new Product("B100", "Men's Dress Shirt", 35.50, new QtyDiscount(.10,5)),
        new Product("C100", "Women's Socks    ", 9.50, new NoDiscount()),
        new Product("D100", "Crib             ", 55.95, new FlatDiscount(5))
                
    };
        
            
        private Customer[] customers = {
        new Customer("100", "John Smith"),
        new Customer("101", "Sally Jones"),
        new Customer("102", "Bob Clementi")
    };
    
        
        @Override
    public final Product findProduct(final String productId) {
        // validation is needed for method parameterS
        if(productId == null || productId.length() == 0) {
            System.out.println("illegal argument");
            return null;
        }
        
        Product product = null;
        for(Product p : products) {
            if(productId.equals(p.getProductId())) {
                product = p;
                break;
            }
        }
        return product;
    }
    
        @Override
    public final Customer findCustomer(final String customerId) {
        // validation is needed for method parameter
        if(customerId == null || customerId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findCustomer method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        Customer customer = null;
        for(Customer c : customers) {
            if(customerId.equals(c.getCustomerId())) {
                customer = c;
                break;
            }
        }
        
        return customer;
    }

}
