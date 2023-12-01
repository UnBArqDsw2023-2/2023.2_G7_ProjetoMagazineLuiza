package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcDescontoValorTeste {
    

    @Test
    public void testCalculaDesconto(){
        CalcDescontoStrategy calc = new CalcDescontoValor(20);
        
        float valorTotal = 100.0f;

        float valorComDesconto = calc.calculaDesconto(valorTotal);

        assertEquals(80.0f, valorComDesconto, 0.001f);
    }
}
