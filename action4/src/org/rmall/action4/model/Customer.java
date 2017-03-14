package org.rmall.action4.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017-03-10.
 */
public class Customer implements Serializable {
    private Integer id;
    private String name;
    private String zipCode;
    private String phoneNumber;
    private boolean inDeliveryArea;
    public Customer(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isInDeliveryArea() {
        return inDeliveryArea;
    }

    public void setInDeliveryArea(boolean inDeliveryArea) {
        this.inDeliveryArea = inDeliveryArea;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
