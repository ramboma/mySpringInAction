package org.rmall.action4;

import org.rmall.action4.model.Customer;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Administrator on 2017-03-10.
 */
@Component
public class pizzaFlowActions {
    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException
    {
        Customer customer=new Customer();
        customer.setId(1);
        customer.setName("default");
        customer.setZipCode("");
        customer.setInDeliveryArea(false);

        System.out.println("i'm coming");
        Random r=new Random();
        int i=r.nextInt(10);
        if(i>4) throw new CustomerNotFoundException();
        return new Customer();
    }
}
