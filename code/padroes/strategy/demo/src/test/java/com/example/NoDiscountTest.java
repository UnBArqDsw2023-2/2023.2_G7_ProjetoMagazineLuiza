package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoDiscountTest {

    
    @Test
    public void testCalculaDesconto() {
        CalcDescontoStrategy calc = new NoDiscount();

        float valorTotal = 1034.0f;

        float valorComDesconto = calc.calculaDesconto(valorTotal);

        assertEquals(1034.0f, valorComDesconto, 0.00f);
    }

    @Test
    public void testCalculaDesconto30() {
        CalcDescontoStrategy calc = new NoDiscount();

        float valorTotal = 30.0f;

        float valorComDesconto = calc.calculaDesconto(valorTotal);

        assertEquals(30.0f, valorComDesconto, 0.00f);
    }
}
