package com.example.sweggerPractice.service;

import com.example.sweggerPractice.model.PaymentMethod;
import com.example.sweggerPractice.reposiory.CustomerRepository;
import com.example.sweggerPractice.reposiory.OrderRepository;
import com.example.sweggerPractice.reposiory.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    PaymentRepository paymentRepository;

    public String typeOfPayment(Integer customerId, Integer orderId) throws Exception {
        if(orderRepository.getById(Long.valueOf(orderId)).getPrice()<100){
            if(paymentRepository.getById(Long.valueOf(orderId)).getPaymentMethod()==PaymentMethod.CASH)
                return "Customer "+customerRepository.getById(Long.valueOf(customerId)).getName()+"payed with "+ PaymentMethod.CASH+"the order with the id "+orderId+" and the amount for paying is "+orderRepository.getById(Long.valueOf(orderId)).getPrice();
            else {
                throw new Exception("The payment is not available!");
            }
        }
        else
            return "Customer "+customerRepository.getById(Long.valueOf(customerId)).getName()+"payed with "+ PaymentMethod.CARD+"the order with the id "+orderId+" and the amount for paying is "+orderRepository.getById(Long.valueOf(orderId)).getPrice();

    }

    public String typeOfPaymentLikeTester(Integer customerId, Integer orderId, Double sum) {
        if(sum<100){
            return "The test is for the amount of paying an it have to be with cash. The customer id is: "+customerId+ "and the order id is "+orderId+"payed in "+PaymentMethod.CASH;
        }
        else {
            return "The test is for the amount of paying an it have to be with cash. The customer id is: "+customerId+ "and the order id is "+orderId+"payed in "+PaymentMethod.CARD;

        }
    }
}
