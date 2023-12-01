package com.example;

public class CalcDescontoPorcento implements CalcDescontoStrategy{
    private int porcentagem;

    public CalcDescontoPorcento(int porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public float calculaDesconto(float valorTotal) {
        return valorTotal - (valorTotal * porcentagem / 100);
    }
}
