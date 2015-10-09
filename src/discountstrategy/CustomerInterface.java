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
public interface CustomerInterface {

    String getCustomerId();

    String getEmail();

    String getName();

    String getPhoneNumber();

    void setCustomerId(String customerId);

    void setEmail(String email);

    void setName(String name);

    void setPhoneNumber(String phoneNumber);
    
}
