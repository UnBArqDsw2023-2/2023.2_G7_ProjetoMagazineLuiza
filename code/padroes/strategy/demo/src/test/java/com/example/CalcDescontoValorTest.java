package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcDescontoValorTest {
    
    @Test
    public void testCalculaDesconto(){
        CalcDescontoStrategy calc = new CalcDescontoValor(20);
        float valorTotal = 100.0f;

        float valorComDesconto = calc.calculaDesconto(valorTotal);

        assertEquals(80.0f, valorComDesconto, 0.00f);
    }

    @Test
    public void testCalculaDesconto30(){
        CalcDescontoStrategy calc = new CalcDescontoValor(30);     
        float valorTotal = 247.0f;

        float valorComDesconto = calc.calculaDesconto(valorTotal);

        assertEquals(217.0f, valorComDesconto, 0.00f);
    }
    
}
