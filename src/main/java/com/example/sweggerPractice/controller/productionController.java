package com.example.sweggerPractice.controller;

import com.example.sweggerPractice.service.PaymentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Profile("prod")
public class productionController {
    PaymentService paymentService;
    @PostMapping("/productController")
    public String makePayment(@RequestBody Integer customerId, @RequestBody Integer orderId, @RequestBody Double totalSum) throws Exception {
        paymentService.typeOfPayment(customerId,orderId);
        return "Customer with id: "+customerId+ "payed "+totalSum+" for order "+orderId;

    }
}
