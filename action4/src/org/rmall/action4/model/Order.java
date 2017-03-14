package org.rmall.action4.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-03-10.
 */
public class Order implements Serializable{

    private static final long serialVersionUID=1L;


    private Customer customer;
    private List<Pizza> pizzas;
    private Payment payment;
    public Order()
    {
        pizzas=new ArrayList<Pizza>();
        customer=new Customer();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
