package com.example.sweggerPractice.controller;

import com.example.sweggerPractice.service.PaymentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Profile("dev")
public class devController {
    PaymentService paymentService;
    @PostMapping("/dev")
    public String developerTesting(@RequestBody Integer customerId, @RequestBody Integer orderId){
        return paymentService.typeOfPaymentLikeTester(customerId,orderId,125d);

    }
}
