package com.example;

public class MercadoPagoAdapter implements PaymentGateway {
    private MercadoPagoAPI mercadoPagoAPI;

    public MercadoPagoAdapter(MercadoPagoAPI mercadoPagoAPI) {
        this.mercadoPagoAPI = mercadoPagoAPI;
    }

    @Override
    public void authorize() {
        mercadoPagoAPI.authenticate();
    }

    @Override
    public void debit() {
        mercadoPagoAPI.sendPayment();
    }

    @Override
    public void credit() {
        mercadoPagoAPI.receivePayment();
    }
}
