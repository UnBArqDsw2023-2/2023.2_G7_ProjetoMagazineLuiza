package com.example;

public class NoDiscount implements CalcDescontoStrategy{
    @Override
    public float calculaDesconto(float valorTotal) {
        return valorTotal;
    }
}
