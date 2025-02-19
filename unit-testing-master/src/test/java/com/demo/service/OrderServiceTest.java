package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderServiceTest {

    @Test
    public void testPlaceOrderThrowsException(){
        //emailService.sendEmail(order) in EmailService.java throws an exception.
        //The setCustomerNotified(true); comes after sending an email, meaning
        // it won't execute if an exception occurs.
        //If the exception is thrown, the customer won't be notified.
        Order order = new Order();
        order.setPrice(100.0);
        OrderService orderService = OrderService.getInstance();

        try{
            orderService.placeOrder(order);
            fail("Expected runtime to be thrown from EmailService.sendEmail()");
        }catch (RuntimeException e){
            assertEquals("An Exception Occurred",e.getMessage());
        }
        assertEquals("Price with tax should be correctly calculated",120.0, order.getPriceWithTax(),0.001);
        assertFalse("Customer should not be notified about the exception", order.isCustomerNotified());
    }

    @Test
    public void testPlaceOrderWithCc(){
        //emailService.sendEmail(order, cc) does NOT throw an exception.
        //It always returns true, meaning the customer will always be notified.
        //The method itself returns true.
        Order order = new Order();
        order.setPrice(100.0);
        OrderService orderService = OrderService.getInstance();

        boolean notified = orderService.placeOrder(order,"cc@gmail.com");

        assertEquals("Price with should be calculated carefully", 120.0, order.getPriceWithTax(),0.001);
        assertTrue("Customer should be notified",order.isCustomerNotified());
        assertTrue("Place order with cc should return true", notified);
    }
}