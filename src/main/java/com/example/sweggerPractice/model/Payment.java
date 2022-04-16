package com.example.sweggerPractice.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@RequiredArgsConstructor

public class Payment {
    @Id
    @GeneratedValue
    @NotNull
    private Integer id;
    private PaymentMethod paymentMethod;

    @OneToOne
    Order order;
}
