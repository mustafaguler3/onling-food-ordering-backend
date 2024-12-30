package com.example.food_ordering.service;

import com.example.food_ordering.dto.PaymentDto;
import com.example.food_ordering.entities.Order;

public interface PaymentService {
    boolean processPayment(PaymentDto paymentDto, Order order);
}
