package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário qual tipo de pagamento eles gostariam de usar
        System.out.println("Sua compra deu um total de R$ 55,90. Qual será o método de pagamento?"); 
        System.out.println("1 - Cartão de crédito nacional");  
        System.out.println("2 - Cartão de crédito internacional");

        int paymentChoice = scanner.nextInt();
        scanner.close();

        // Cria um serviço de checkout com o gateway de pagamento escolhido
        CheckoutService checkoutService = new CheckoutService(paymentChoice);

        // Realiza o checkout
        checkoutService.checkout();
    }
}
