package com.example.sweggerPractice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity
@Table(name="order_table")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
    @Id
    @GeneratedValue
    @NotNull
    private Integer id;
    private double price;

    @ManyToOne
    Customer customer;

    @OneToOne
    Payment payment;

}
