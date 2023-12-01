package com.example;

public class CheckoutService {
    private PaymentGateway paymentGateway;

    public CheckoutService(int paymentChoice) {
        // A depender da escolha passada pro construtor, escolhe qual adaptador será utilizado
        if (paymentChoice == 1) 
        {
            this.paymentGateway = new MercadoPagoAdapter(new MercadoPagoAPI());
        } 
        else if (paymentChoice == 2) 
        {
            this.paymentGateway = new PaypalAdapter(new PaypalAPI());
        }
        // Se não for nenhuma das escolhas definidas, o pagamento é inválido
        else 
        {
            throw new IllegalArgumentException("Método de pagamento inválido!");
        }
    }

    public void checkout() {
        paymentGateway.authorize();
        paymentGateway.debit();
    }
}
