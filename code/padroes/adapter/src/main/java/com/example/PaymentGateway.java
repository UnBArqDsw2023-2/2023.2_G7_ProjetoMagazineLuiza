package com.example;

public interface PaymentGateway {
    void authorize();
    void debit();
    void credit();
}