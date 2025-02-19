package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailServiceTest{

    @Test
    public void testGetInstance(){
        EmailService emailService = EmailService.getInstance();
        assertNotNull("EmailService instance should not be null",emailService);
    }

    @Test
    public void testSendEmailThrowsException(){
        Order order = new Order();
        EmailService emailService = EmailService.getInstance();
        try{
            emailService.sendEmail(order);
            fail("Expected RuntimeException to be thrown ");
        }catch (RuntimeException e){
            // Verifying that the exception message is correct that we passed in src class
            assertEquals("An Exception Occurred",e.getMessage());
        }
        // Checking that customer notification is set to false before throwing exception
        assertFalse("Customer should not be notified about the exception",order.isCustomerNotified());
    }


//    boolean sendEmail(Order order, String cc) {
//        order.setCustomerNotified(true);
//        return true;
//    }

    @Test
    public void testSendEmailWithCc(){
        Order order = new Order();
        EmailService emailService = EmailService.getInstance();

        assertTrue("Email should be sent successfully with cc",emailService.sendEmail(order,"cc@gmail.com"));
        assertTrue("Customer should be notified",order.isCustomerNotified());
    }
}