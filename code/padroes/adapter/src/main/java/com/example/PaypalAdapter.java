package com.example;

public class PaypalAdapter implements PaymentGateway {
    private PaypalAPI PaypalAPI;

    public PaypalAdapter(PaypalAPI PaypalAPI) {
        this.PaypalAPI = PaypalAPI;
    }

    @Override
    public void authorize() {
        PaypalAPI.authenticate();
    }

    @Override
    public void debit() {
        PaypalAPI.sendPayment();
    }

    @Override
    public void credit() {
        PaypalAPI.receivePayment();
    }
}
