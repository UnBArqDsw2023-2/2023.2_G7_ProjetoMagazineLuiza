package com.example;

public class CalcDescontoValor implements CalcDescontoStrategy{
    private float valorFixo;

    public CalcDescontoValor(float valorFixo) {
        this.valorFixo = valorFixo;
    }

    @Override
    public float calculaDesconto(float valorTotal) {
        return valorTotal - valorFixo;
    }
}
