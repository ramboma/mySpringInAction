package org.rmall.action4;

/**
 * Created by Administrator on 2017-03-10.
 */
@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException()
    {
    }
    public CustomerNotFoundException(String message)
    {
        super(message);
    }
}
